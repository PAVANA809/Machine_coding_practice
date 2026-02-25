package com.pvn.MovieTicketBooking;

import java.util.ArrayList;
import java.util.List;

public class Screen {
    ScreenType screenType;
    List<Seat> seats;
    int capacity;
    List<Show> show;

    public Screen(ScreenType screenType, int capacity) {
        this.screenType = screenType;
        this.capacity = capacity;
        this.show = new ArrayList<>();
        seats = new ArrayList<>();
        for(int i = 1; i <= capacity; i++) {
            seats.add(new Seat(i, SeatType.GOLD));
        }
    }

    public void setScreenType(ScreenType screenType) {
        this.screenType = screenType;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
