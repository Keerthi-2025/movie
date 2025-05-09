package com.movieticket.movie.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

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



    @ManyToOne
    @JoinColumn(name = "userId")
    private  User user;






}
