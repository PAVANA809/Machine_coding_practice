package com.pvn.MovieTicketBooking;

public enum SeatType {
    SILVER(150),
    GOLD(200),
    PLATINUM(300);

    private final int price;

    SeatType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
