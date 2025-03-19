package org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@ToString
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String url;
    private String caption;
    @ManyToOne
    private Appartamento appartamento;
    @ManyToOne
    private Building building;
}
