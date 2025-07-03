package com.movieticket.movie.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "Showtime")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Showtime {
        @Id
        private String showtimeId;

        @ManyToOne
        @JoinColumn(name = "movieId", nullable = false)
        private Movie movie;

        @ManyToOne
        @JoinColumn(name = "theaterId", nullable = false)
        private Theater theater;

        @Column(nullable = false)
        private LocalDateTime startTime;

        @Column(nullable = false)
        private LocalDateTime endTime;

        @OneToMany(mappedBy = "showtime", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
        private List<SeatAvailability> seatAvailabilities;
}

