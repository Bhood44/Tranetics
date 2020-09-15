package com.example.demo.entities;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Set;

@Entity
@Table(name = "WORKOUT")
public class Workout {

    @Id
    @Column(name = "WORKOUT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;

    @Column(name = "WORKOUT_TYPE")
    private String type;

    private Exercise [] workout;

    public Workout() {
    }

    public Workout(String title, String type, Exercise[] workout) {
        this.title = title;
        this.type = type;
        this.workout = workout;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Exercise[] getWorkout() {
        return workout;
    }

    public void setWorkout(Exercise[] workout) {
        this.workout = workout;
    }

    @Override
    public String toString() {
        return "Workout{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", workout=" + Arrays.toString(workout) +
                '}';
    }
}
