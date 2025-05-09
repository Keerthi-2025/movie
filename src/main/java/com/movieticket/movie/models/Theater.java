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

}
