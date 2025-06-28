package com.model;

@Entity
@Table (name = "users")

Public class User{
    @Id
    @GenratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Etring username;

    private  String password;

    private String email;

    // getters and setters
}