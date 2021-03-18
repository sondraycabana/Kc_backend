package com.kingcabana.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class VendorAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String officeNo;
    @Column(nullable = false)
    private String Street;
    @Column(nullable = false)
    private String state;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String country;
}
