package com.example.demo.entities;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "USER")
public class User {

    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String email;
    private String password;
    private String firstname;
    private String lastname;
    private String profession;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "BODYTYPE_ID")
    private Bodytype bodyType;

    private double weight;

    @Transient
    private Goal [] goals;

    @Transient
    private Exercise [] workout;

    public User() {
    }

    public User(String email, String password, String firstname, String lastname, String profession, Bodytype bodyType, double weight, Goal[] goals, Exercise[] workout) {
        this.email = email;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.profession = profession;
        this.bodyType = bodyType;
        this.weight = weight;
        this.goals = goals;
        this.workout = workout;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", profession='" + profession + '\'' +
                ", bodyType=" + bodyType +
                ", weight=" + weight +
                ", goals=" + Arrays.toString(goals) +
                ", workout=" + Arrays.toString(workout) +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Bodytype getBodyType() {
        return bodyType;
    }

    public void setBodyType(Bodytype bodyType) {
        this.bodyType = bodyType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Goal[] getGoals() {
        return goals;
    }

    public void setGoals(Goal[] goals) {
        this.goals = goals;
    }

    public Exercise[] getWorkout() {
        return workout;
    }

    public void setWorkout(Exercise[] workout) {
        this.workout = workout;
    }
}
