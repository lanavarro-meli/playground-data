package com.example.datapraticaintegradoraiii.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
@Entity
@Data
public class Movies extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private double rating;
    private int awards;
    private LocalDateTime release_date;
    private int length;
   @ManyToMany
   @JoinTable(name ="actor_movie", joinColumns = @JoinColumn(name = "movie_id", referencedColumnName = "id"),
           inverseJoinColumns = @JoinColumn(name="actor_id", referencedColumnName = "id"))
    @JsonIgnoreProperties("movies")
    private List<Actors> actors;


}
