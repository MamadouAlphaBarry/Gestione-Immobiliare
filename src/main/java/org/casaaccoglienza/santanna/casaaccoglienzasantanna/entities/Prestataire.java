package org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "prestataire")
public class Prestataire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome; // nom
    private String telefono; // téléphone
    private String email; // email
    private String specialita; // spécialité (ex : "elettricità", "idraulica")

    @OneToMany(mappedBy = "prestataire", cascade = CascadeType.ALL)
    private List<Lavoro> lavori;

    // Getters and Setters
}
