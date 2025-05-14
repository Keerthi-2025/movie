package com.movieticket.movie.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "Movie")
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Movie {
    @Id
    private String movieId;

    @Column(nullable = false)
    private String title;

    @Column
    private  String genre;

    @Column
    private String duration;

    @Column
    private  String rating;

    @Column
    private  String poster;

   @OneToMany(mappedBy = "movie",cascade = CascadeType.ALL) //movie and showtime
    private List<Seat>seats;


}
