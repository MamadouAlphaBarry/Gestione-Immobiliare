package org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities;

import jakarta.persistence.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "appartamento")
public class Appartamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero; // numero
    private double superficie; // surface

    @ManyToOne
    @JoinColumn(name = "maison_id")
    private Maison maison;

    @OneToMany(mappedBy = "appartamento", cascade = CascadeType.ALL)
    private List<Contratto> contratti;

    @OneToMany(mappedBy = "appartamento", cascade = CascadeType.ALL)
    private List<Lavoro> lavori;

    @OneToOne(mappedBy = "appartamento", cascade = CascadeType.ALL)
    private Locatario locatario;

    // Getters and Setters
}
