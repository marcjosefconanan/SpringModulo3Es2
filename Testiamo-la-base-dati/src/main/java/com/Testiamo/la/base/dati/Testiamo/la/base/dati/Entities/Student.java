package com.Testiamo.la.base.dati.Testiamo.la.base.dati.Entities;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @PrimaryKeyJoinColumn
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String lastNamw;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false,unique = true)
    private String email;

    public Student(Long id, String lastNamw, String firstName, String email) {
        this.id = id;
        this.lastNamw = lastNamw;
        this.firstName = firstName;
        this.email = email;
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastNamw() {
        return lastNamw;
    }

    public void setLastNamw(String lastNamw) {
        this.lastNamw = lastNamw;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
