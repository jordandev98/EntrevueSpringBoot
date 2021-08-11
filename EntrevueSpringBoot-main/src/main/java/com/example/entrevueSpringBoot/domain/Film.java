package com.example.entrevueSpringBoot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Film")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public class Film {

    @GeneratedValue
    @Id
    private Long id;
    private String titre;
    private String description;

    @OneToMany(cascade = CascadeType.ALL)
    @OrderColumn(name = "idActeur")
    private List<Acteur> acteurs;

    public Film(String titre, String description, List<Acteur> acteurs) {
        this.titre = titre;
        this.description = description;
        this.acteurs = acteurs;
    }
}
