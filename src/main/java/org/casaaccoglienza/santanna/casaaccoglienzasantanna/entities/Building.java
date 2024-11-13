package org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "maison")
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String indirizzo;
    private int capacita;
    private String stato;
    private String via;
    private int civico;
    private double latitudine;
    private double longitudine;

    @OneToMany(mappedBy = "building", cascade = CascadeType.ALL)
    private List<Appartamento> appartamenti = new ArrayList<>();

    @OneToMany(mappedBy = "building", cascade = CascadeType.ALL)
    private List<Spesa> spese = new ArrayList<>();

    @OneToMany(mappedBy = "building", cascade = CascadeType.ALL)
    private List<Lavoro> lavori = new ArrayList<>();

    @OneToMany(mappedBy = "building", cascade = CascadeType.ALL)
    private List<Image> images = new ArrayList<>();
}
