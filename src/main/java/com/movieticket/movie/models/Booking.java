package com.movieticket.movie.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Booking", uniqueConstraints = @UniqueConstraint(
        columnNames = {"seat_availability_id", "showtimeId"}
))
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id
    private String bookingId;
    private LocalDateTime bookingDate;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "seat_availability_id")
    private SeatAvailability seatAvailability;

    @ManyToOne
    @JoinColumn(name = "showtimeId")
    private Showtime showtime;


}

package com.movieticket.movie.models;

import jakarta.persistence.*;
        import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Booking", uniqueConstraints = @UniqueConstraint(
        columnNames = {"seat_availability_id", "showtimeId"}
))
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id
    private String bookingId;
    private LocalDateTime bookingDate;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "seat_availability_id")
    private SeatAvailability seatAvailability;

    @ManyToOne
    @JoinColumn(name = "showtimeId")
    private Showtime showtime;


}