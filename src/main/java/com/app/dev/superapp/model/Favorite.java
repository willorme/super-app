package com.app.dev.superapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "favorite movies")
public class Favorite {

    @Id
    @GeneratedValue
    private String movieId;
    private String directorName;
    private String releaseDate;

    @ManyToOne
    @JoinColumn(name="userId")
    private User user;
}
