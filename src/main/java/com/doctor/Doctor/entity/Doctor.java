package com.doctor.Doctor.entity;

import jakarta.persistence.*;

@Entity

public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String specification;
}
