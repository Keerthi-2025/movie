package com.movieticket.movie.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "Theater")
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Theater {

    @Id
    private  String theaterId;

    @Column
    private  String name;

    @Column
    private  String location;

    @OneToMany(mappedBy = "theater",cascade =CascadeType.ALL)  //theater and showtime
    private List<Seat> seats;


}
