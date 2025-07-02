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
    private String theaterId;

    private String name;
    private String location;

    @OneToMany(mappedBy = "theater", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Seat> seats;
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
@Table(name = "Theater")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Theater {
    @Id
    private String theaterId;

    private String name;
    private String location;

    @OneToMany(mappedBy = "theater", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Seat> seats;
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
@Table(name = "Theater")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Theater {
    @Id
    private String theaterId;

    private String name;
    private String location;

    @OneToMany(mappedBy = "theater", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Seat> seats;
}