package com.kingcabana.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;


@Data
@Entity
public class BookVendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private EventOrganizer eventOrganizer;

    private LocalDate date;
    private boolean delivered;
    private Boolean canceled;

}
