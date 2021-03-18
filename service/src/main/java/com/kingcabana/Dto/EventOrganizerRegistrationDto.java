package com.kingcabana.Dto;

import lombok.Data;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
@Data
public class EventOrganizerRegistrationDto {

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @NotEmpty
    private String password;

    @NotEmpty
    private String confirmPassword;

    @Email
    @NotEmpty
    private String email;

    @NotEmpty
    private String phoneNumber;

}
