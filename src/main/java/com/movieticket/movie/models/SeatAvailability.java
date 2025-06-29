package com.movieticket.movie.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "seat_availability")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SeatAvailability {
    @Id
    private String id;

    private boolean available = true;

    @ManyToOne
    @JoinColumn(name = "seat_id")
    private Seat seat;

    @ManyToOne
    @JoinColumn(name = "showtime_id")
    private Showtime showtime;

    @OneToMany(mappedBy = "seatAvailability", cascade = CascadeType.ALL)
    private List<Booking> bookings;
}