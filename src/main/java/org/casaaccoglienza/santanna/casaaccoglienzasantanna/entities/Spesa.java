package org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities;

import jakarta.persistence.*;


import java.util.Date;

@Entity
@Table(name = "spesa")
public class Spesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipoSpesa; // type de dépense (ex : "manutenzione", "fattura", "riparazione")
    private double importo; // montant
    private Date dataSpesa; // date de dépense
    private String descrizione; // description

    @ManyToOne
    @JoinColumn(name = "maison_id")
    private Maison maison;

    @ManyToOne
    @JoinColumn(name = "appartamento_id")
    private Appartamento appartamento;

    // Getters and Setters
}
