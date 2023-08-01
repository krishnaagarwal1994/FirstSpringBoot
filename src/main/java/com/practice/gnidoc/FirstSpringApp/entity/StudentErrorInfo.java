package com.practice.gnidoc.FirstSpringApp.entity;

import jakarta.persistence.Entity;

public class StudentErrorInfo {
    String title;
    String message;

    public StudentErrorInfo(String title, String message) {
        this.title = title;
        this.message = message;
    }
}

