package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "GOAL")
public class Goal {

    @Id
    @Column(name = "GOAL_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JoinColumn(name="USER_ID")
    private int userId;

    private String title;
    private int start;
    private int end;
    private boolean isActive;

    public Goal() {
    }

    public Goal(int userId, String title, int start, int end, boolean isActive) {
        this.userId = userId;
        this.title = title;
        this.start = start;
        this.end = end;
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Goal{" +
                "id=" + id +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", start=" + start +
                ", end=" + end +
                ", isActive=" + isActive +
                '}';
    }
}
