package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "BODYTYPE")
public class Bodytype {

    @Id
    @Column(name = "BODYTYPE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "TYPE")
    private String bodyType;

    public Bodytype() {
    }

    public Bodytype(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Bodytype{" +
                "id=" + id +
                ", bodyType='" + bodyType + '\'' +
                '}';
    }
}
