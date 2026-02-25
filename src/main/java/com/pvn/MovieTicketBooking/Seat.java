package com.pvn.MovieTicketBooking;

public class Seat {
    private int seatId;
    private SeatType type;

    public Seat(int seatId, SeatType type) {
        this.seatId = seatId;
        this.type = type;
    }

    public int getSeatId() {
        return seatId;
    }

    public SeatType getType() {
        return type;
    }
}
