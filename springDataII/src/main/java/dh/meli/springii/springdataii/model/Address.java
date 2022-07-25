package dh.meli.springii.springdataii.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String location;
    @OneToOne
    @JoinColumn(name ="id_author") // indica quem sera a chave estrangeira
    private Author author;

}
