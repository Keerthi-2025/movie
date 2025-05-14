package com.movieticket.movie.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ValueGenerationType;

import java.util.List;

@Data
@Entity
@Table(name = "Seat")
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  String seatId;

    @Column
    private  String showtimeId;

    @Column
    private String seatRow;

    @Column
    private  String seatNumber;

    @Column
    private boolean seatAvail = true;

    @Column
    private  String seatType;

    @Column
    private  String seatSection;

    @ManyToOne  //movie and showtime
    @JoinColumn(name = "movie")
    private  Movie movie;

    @ManyToOne   //theater and showtime
    @JoinColumn(name = "theater_id")
    private Theater theater;

    @OneToMany(mappedBy = "seat",cascade = CascadeType.ALL)  //showtime and booking
    private List<Booking> bookings;

   // @OneToOne(mappedBy = "seatid",cascade = CascadeType.ALL)
   // private Booking booking;



}


