package com.practice.gnidoc.FirstSpringApp.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class StudentRequestModel {
    @JsonProperty(value = "first_name", required = true)
    public String firstName;

    @JsonProperty(value = "last_name", required = true)
    public String lastName;

    @JsonProperty(value = "email", required = true)
    public String email;
}
