package com.kingcabana.repository;

import com.kingcabana.DataConfig;
import com.kingcabana.model.EventOrganizer;
import com.kingcabana.model.EventOrganizerAddress;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = DataConfig.class)
@Slf4j
class EventOrganizerAddressRepositoryTest {

    @Autowired
    EventOrganizerAddressRepository eventOrganizerAddressRepository;

    @BeforeEach
    void setUp() {
    }
    @Test
    public void saveAddress(){
        EventOrganizerAddress eventOrganizerAddress = new EventOrganizerAddress();
        EventOrganizer eventOrganizer = new EventOrganizer();

        eventOrganizer.setFirstName("ade");
        eventOrganizer.setLastName("Agbaje");
        eventOrganizer.setPhoneNumber("0908765453");
        eventOrganizer.setEmailAddress("ade@gmail.com");
        eventOrganizer.setPassword("12345");


        eventOrganizerAddress.setHouseNo("12");
        eventOrganizerAddress.setStreet("tola st ");
        eventOrganizerAddress.setState("lagos");
        eventOrganizerAddress.setCity("lagos city");
        eventOrganizerAddress.setCountry("nigeria");
        eventOrganizerAddress.setZipCode("100011");
//        eventOrganizerAddress.setEventOrganizerList( eventOrganizer);

        eventOrganizerAddressRepository.save(eventOrganizerAddress);
        log.info("save address ->{}",eventOrganizerAddress);
    }
}