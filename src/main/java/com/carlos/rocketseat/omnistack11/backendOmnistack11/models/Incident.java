package com.carlos.rocketseat.omnistack11.backendOmnistack11.models;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Incident implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    private String title;
    private String description;
    private float value;

    @ManyToOne(optional = false)
    private Ong ong;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public Ong getOng() {
        return ong;
    }

    public void setOng(Ong ong) {
        this.ong = ong;
    }
}
