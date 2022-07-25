package br.dh.meli.springdatai.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_user")
public class UserModel {
    @Id // indica que e a chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //indica geracao sequencial
    private long id;
    @Column(name = "name", length = 100,nullable = false)
    private String name;
    @Column(name = "email", length = 80,nullable = false, unique = true)
    private String email;
}
