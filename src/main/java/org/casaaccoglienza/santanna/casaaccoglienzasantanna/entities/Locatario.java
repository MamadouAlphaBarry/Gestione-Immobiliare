package org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities;


import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "locatario")
public class Locatario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome; // nom
    private String cognome; // prénom
    private Date dataNascita; // date de naissance
    private String telefono; // téléphone
    private String email; // email

    @ManyToOne
    @JoinColumn(name = "maison_id")
    private Maison maison;

    @ManyToOne
    @JoinColumn(name = "appartamento_id")
    private Appartamento appartamento;

    @OneToMany(mappedBy = "locatario", cascade = CascadeType.ALL)
    private List<Contratto> contratti;

    @OneToMany(mappedBy = "locatario", cascade = CascadeType.ALL)
    private List<Richiesta> richieste;

    // Getters and Setters
}
