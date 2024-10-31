package org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "maison")
public class Maison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String indirizzo; // adresse
    private int capacita; // capacité
    private String stato; // état (ex : "buono", "bisogno di riparazioni")

    @OneToMany(mappedBy = "maison", cascade = CascadeType.ALL)
    private List<Appartamento> appartamenti;

    @OneToMany(mappedBy = "maison", cascade = CascadeType.ALL)
    private List<Contratto> contratti;

    @OneToMany(mappedBy = "maison", cascade = CascadeType.ALL)
    private List<Spesa> spese;

    @OneToMany(mappedBy = "maison", cascade = CascadeType.ALL)
    private List<Lavoro> lavori;

    @OneToMany(mappedBy = "maison", cascade = CascadeType.ALL)
    private List<Locatario> locatari;

    // Getters and Setters
}
