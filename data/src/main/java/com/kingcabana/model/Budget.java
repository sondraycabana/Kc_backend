package com.kingcabana.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private int numberOfAttendee;
    private BigDecimal eventVenueBudget;
    private BigDecimal plateOfFoodBudget;
    private BigDecimal musicServiceBudget;
    private BigDecimal venueDesignBudget;
    private BigDecimal drinkBudget;
}
