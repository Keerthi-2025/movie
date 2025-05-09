package com.movieticket.movie.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Seat")
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Seat {
    @Id
    private  String seatId;

    @Column(nullable = false)
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


}
