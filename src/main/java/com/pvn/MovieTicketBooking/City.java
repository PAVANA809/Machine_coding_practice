package com.pvn.MovieTicketBooking;

import java.util.List;

public class City {
    String name;
    List<Theater> theaters;

    public City(String name, List<Theater> theaters) {
        this.name = name;
        this.theaters = theaters;
    }

    public String getName() {
        return name;
    }

    public List<Theater> getTheaters() {
        return theaters;
    }
}
