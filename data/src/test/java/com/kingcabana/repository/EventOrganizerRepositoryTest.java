package com.kingcabana.repository;

import com.kingcabana.DataConfig;
import com.kingcabana.model.EventOrganizer;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = DataConfig.class)
@Slf4j
//@Sql(scripts = {"classpath:db/insert.sql"})
class EventOrganizerRepositoryTest {
    @Autowired
    private EventOrganizerRepository eventOrganizerRepository;
    @BeforeEach
    void setUp() {
    }
    @Test
    public void saveEventOrganizer(){
        EventOrganizer eventOrganizer = new EventOrganizer();

        EventOrganizer eventOrganizer1 = new EventOrganizer();



        eventOrganizer1.setFirstName("oyin");
        eventOrganizer1.setLastName("adeeyemi");
        eventOrganizer1.setPhoneNumber("0908765453");
        eventOrganizer1.setEmailAddress("oyin@gmail.com");
        eventOrganizer1.setPassword("98765");


        eventOrganizer.setFirstName("toyin");
        eventOrganizer.setLastName("opeyemi");
        eventOrganizer.setPhoneNumber("0908765453");
        eventOrganizer.setEmailAddress("totin@gmail.com");
        eventOrganizer.setPassword("98765");


        eventOrganizerRepository.save(eventOrganizer1);
        eventOrganizerRepository.save(eventOrganizer);
        log.info("saving event organizer->{}", eventOrganizer);



    }
}