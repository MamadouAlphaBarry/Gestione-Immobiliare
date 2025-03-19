package org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities;

import jakarta.persistence.*;
import lombok.*;


import java.util.List;

@Entity
@Table(name = "appartamento")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Appartamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int numeroDuCase; // numero
    private double superficie; // surface
    private String via;
    private double latitudine ;
    private double longitudine ;
    private int numero;
    @ManyToOne
    @JoinColumn(name = "maison_id")
    private Building building;

    @OneToMany(mappedBy = "appartamento", cascade = CascadeType.ALL)
    private List<Contratto> contratti;

    @OneToMany(mappedBy = "appartamento", cascade = CascadeType.ALL)
    private List<Lavoro> lavori;

    @OneToOne(mappedBy = "appartamento", cascade = CascadeType.ALL)
    private Locatario locatario;
    @OneToMany(mappedBy = "appartamento", cascade = CascadeType.ALL)
    private List<Image> images;
    // Getters and Setters
}
