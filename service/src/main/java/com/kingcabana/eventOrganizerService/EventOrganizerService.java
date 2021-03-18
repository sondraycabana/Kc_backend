package com.kingcabana.eventOrganizerService;

import com.kingcabana.Dto.EventOrganizerRegistrationDto;
import com.kingcabana.exception.RegisterException;
import com.kingcabana.model.EventOrganizer;

import java.util.List;
import java.util.Optional;

public interface EventOrganizerService  {
    EventOrganizer register(EventOrganizerRegistrationDto registration) throws RegisterException;
    Optional<EventOrganizer> findByEmail(String email);
    List<EventOrganizer> findAll();
    EventOrganizer save(EventOrganizer eventOrganizer);
}
