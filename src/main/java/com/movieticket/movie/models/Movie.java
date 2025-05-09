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




}
