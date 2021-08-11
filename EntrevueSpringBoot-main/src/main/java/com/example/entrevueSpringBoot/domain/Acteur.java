package com.example.entrevueSpringBoot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Acteur")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Acteur {

    @Id
    @GeneratedValue
    private Long idActeur;
    private String nom;
    private String prenom;

}
