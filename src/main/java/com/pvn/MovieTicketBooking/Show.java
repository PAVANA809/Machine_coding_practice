package com.pvn.MovieTicketBooking;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Show {
    private Movie movie;
    Map<Integer, SeatLock> seatStatusMap;
    LocalDateTime startTime;
    LocalDateTime endTime;

    public Show(Movie movie, LocalDateTime startTime, LocalDateTime endTime, List<Seat> seats) {
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = endTime;
        seatStatusMap = new HashMap<>();
        for(Seat seat: seats)
            seatStatusMap.put(seat.getSeatId(), new SeatLock(SeatStatus.AVAILABLE));
    }

    public Movie getMovie() {
        return movie;
    }

    public Map<Integer, SeatLock> getSeatStatusMap() {
        return seatStatusMap;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }
}
