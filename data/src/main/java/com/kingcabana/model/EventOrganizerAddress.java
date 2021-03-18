package com.kingcabana.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class EventOrganizerAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String houseNo;
    @Column(nullable = false)
    private String Street;
    @Column(nullable = false)
    private String state;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String country;
    private String zipCode;


    @ManyToMany(cascade = CascadeType.ALL)
    public List<EventOrganizer> eventOrganizerList;

    public void addEventOrganizer(EventOrganizer eventOrganizer){
        if(eventOrganizerList == null){
            eventOrganizerList = new ArrayList<>();
        }
        eventOrganizerList.add(eventOrganizer);
    }





}
