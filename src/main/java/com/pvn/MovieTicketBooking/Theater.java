package com.pvn.MovieTicketBooking;

import java.util.List;

public class Theater {
    int theaterId;
    List<Screen> screenList;

    public Theater(int theaterId, List<Screen> screenList) {
        this.theaterId = theaterId;
        this.screenList = screenList;
    }

    public int getTheaterId() {
        return theaterId;
    }

    public List<Screen> getScreenList() {
        return screenList;
    }
}
