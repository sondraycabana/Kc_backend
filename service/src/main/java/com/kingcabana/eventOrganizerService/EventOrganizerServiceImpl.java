package com.kingcabana.eventOrganizerService;

import com.kingcabana.Dto.EventOrganizerRegistrationDto;
import com.kingcabana.exception.RegisterException;
import com.kingcabana.model.EventOrganizer;
import com.kingcabana.repository.EventOrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventOrganizerServiceImpl implements EventOrganizerService {

    @Autowired
    EventOrganizerRepository eventOrganizerRepository;

    @Autowired
    EventOrganizerService eventOrganizerService;

    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    @Override
    public EventOrganizer register(EventOrganizerRegistrationDto registration) throws RegisterException {
        checkForDuplicate(registration);
        EventOrganizer eventOrganizer = new EventOrganizer();
        eventOrganizer.setFirstName(registration.getFirstName());
        eventOrganizer.setLastName(registration.getLastName());
        eventOrganizer.setEmailAddress(registration.getEmail());
        eventOrganizer.setPassword(bCryptPasswordEncoder.encode(registration.getPassword()));

        return save(eventOrganizer);
    }

    @Override
    public Optional<EventOrganizer> findByEmail(String email) {
        return eventOrganizerRepository.findByEmailAddress(email);

    }

    @Override
    public List<EventOrganizer> findAll() {
        return eventOrganizerRepository.findAll();
    }

    //This method is checking if the email user is registering with has not been taken
    public void checkForDuplicate(EventOrganizerRegistrationDto registrationDto) throws RegisterException {
        Optional<EventOrganizer> eventOrganizerExist = eventOrganizerService.findByEmail(registrationDto.getEmail());
        if (eventOrganizerExist.isPresent()) {
            throw new RegisterException("Event organizer with this email exist");
        }

        //return eventOrganizerService.save(registrationDto);

    }
    @Override
    public EventOrganizer save(EventOrganizer eventOrganizer) {

        return eventOrganizerRepository.save(eventOrganizer);
    }



}
