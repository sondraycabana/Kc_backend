package com.kingcabana.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String profilePicture;
    private LocalDate dateOfBirth;
    private Gender gender;
    private String twitterHandle;
    private String instagramHandle;
    private String faceBookHandle;

}
