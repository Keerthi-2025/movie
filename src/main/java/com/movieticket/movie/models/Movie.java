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

    @Enumerated(EnumType.STRING)
    private Genre genre;

    private String duration;
    private String rating;
    private String poster;

    @OneToMany(mappedBy = "movie", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Showtime> showtimes;
}

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

    @Enumerated(EnumType.STRING)
    private Genre genre;

    private String duration;
    private String rating;
    private String poster;

    @OneToMany(mappedBy = "movie", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Showtime> showtimes;
}