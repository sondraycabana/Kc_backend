package com.kingcabana.model;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class EventOrganizer {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String firstName;
    private String LastName;
    private String phoneNumber;
    private String emailAddress;
    private String password;

    @ManyToMany( cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<EventOrganizerAddress> eventAddressList;


}
