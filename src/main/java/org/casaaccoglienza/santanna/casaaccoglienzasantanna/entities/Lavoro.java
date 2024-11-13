package org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "lavoro")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Lavoro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipoLavoro; // type de travaux (ex : "idraulica", "elettricità")
    private String descrizione; // description
    private Date dataInizio; // date de début
    private Date dataFine; // date de fin
    private double costoStimato; // coût estimé
    private double costoReale; // coût réel

    @ManyToOne
    @JoinColumn(name = "maison_id")

    private Building building;

    @ManyToOne
    @JoinColumn(name = "appartamento_id")
    private Appartamento appartamento;

    @ManyToOne
    @JoinColumn(name = "prestataire_id")
    private Prestataire prestataire;

    // Getters and Setters
}
