package org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "richiesta")
public class Richiesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipoRichiesta; // type de demande (ex : "riparazione", "miglioramento")
    private String descrizione; // description
    private Date dataRichiesta; // date de demande
    private String stato; // statut (ex : "in corso", "completata")

    @ManyToOne
    @JoinColumn(name = "locatario_id")
    private Locatario locatario;

    @ManyToOne
    @JoinColumn(name = "lavoro_id")
    private Lavoro lavoro;

    // Getters and Setters
}
