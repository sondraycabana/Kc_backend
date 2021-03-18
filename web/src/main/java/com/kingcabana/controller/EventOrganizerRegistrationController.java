package com.kingcabana.controller;

//import com.king.cabana.eventOrganizerService.EventOrganizerService;
import com.kingcabana.Dto.EventOrganizerRegistrationDto;
import com.kingcabana.eventOrganizerService.EventOrganizerService;
import com.kingcabana.eventOrganizerService.EventOrganizerServiceImpl;
import com.kingcabana.exception.RegisterException;
import com.kingcabana.model.EventOrganizer;
import com.kingcabana.repository.EventOrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registration")
public class EventOrganizerRegistrationController {

    @Autowired
    private EventOrganizerServiceImpl eventOrganizerService;

//    @Autowired
//    private EventOrganizerRepository eventOrganizerRepository;

    @GetMapping("/organizer")
    public List<EventOrganizer> getAllEventOrganizer(){
       return eventOrganizerService.findAll();

    }

//    @PostMapping("/create")
//    public EventOrganizer register(@RequestBody EventOrganizer eventOrganizer) throws RegisterException {
//        return eventOrganizerService.save(eventOrganizer);
//    }

    @PostMapping("/create")
    public EventOrganizer register(@RequestBody EventOrganizerRegistrationDto eventOrganizer) throws RegisterException {
        return eventOrganizerService.register(eventOrganizer);
    }

    @GetMapping("/")
    public String root(){
        return "index";
    }

}
