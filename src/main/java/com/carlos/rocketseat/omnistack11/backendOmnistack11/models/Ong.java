package com.carlos.rocketseat.omnistack11.backendOmnistack11.models;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Entity
public class Ong implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @NotNull
    private String name;

    @NotNull
    private String email;

    @NotNull
    private String whatsapp;

    @NotNull
    private String city;

    @NotNull
    private String uf;

    @OneToMany(cascade=ALL,  orphanRemoval = true)
    @JoinColumn(name = "ong_id")
    private Set<Incident> incidents = new HashSet<Incident>();

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        this.Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

}
