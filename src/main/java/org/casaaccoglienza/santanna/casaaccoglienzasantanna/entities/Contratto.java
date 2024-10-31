package org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "contratto")
public class Contratto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipoContratto; // type de contrat (ex : "normale", "comodato d'uso")
    private Date dataInizio; // date de début
    private Date dataFine; // date de fin
    private double importoAffitto; // montant du loyer
    private double cauzione; // caution

    @ManyToOne
    @JoinColumn(name = "maison_id")
    private Maison maison;

    @ManyToOne
    @JoinColumn(name = "appartamento_id")
    private Appartamento appartamento;

    @ManyToOne
    @JoinColumn(name = "locatario_id")
    private Locatario locatario;

    // Getters and Setters
}
