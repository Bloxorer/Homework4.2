package com.example.homework42;

import java.io.Serializable;

public class Ticket implements Serializable {
    private String id;
    private String time_come;
    private String time_arrive;
    private String place;
    private String cost;

    public Ticket(String id, String time_come, String time_arrive, String place, String cost) {
        this.id = id;
        this.time_come = time_come;
        this.time_arrive = time_arrive;
        this.place = place;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTime_come() {
        return time_come;
    }

    public void setTime_come(String time_come) {
        this.time_come = time_come;
    }

    public String getTime_arrive() {
        return time_arrive;
    }

    public void setTime_arrive(String time_arrive) {
        this.time_arrive = time_arrive;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
