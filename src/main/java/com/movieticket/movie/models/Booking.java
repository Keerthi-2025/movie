package com.movieticket.movie.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Table(name = "Booking")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Booking {
    @Id
    private  String bookId;

    @Column(nullable = false)
    private String showtimeId;

    @Column
    private  String seatId;

    @Column(nullable = false)
    private LocalDateTime bookingDate;

    @Column
    private String paymentStatus;

    @Column
    private PaymentMethod paymentMethod;


    @ManyToOne // user and booking
    @JoinColumn(name = "userId")
    private  User user;

   @ManyToOne    //showtime and booking
   @JoinColumn(name = "showtime")
    private Seat seat;

   /*@OneToOne
    @JoinColumn(name = "seatId")
    private Seat seat;*/








}
