package org.casaaccoglienza.santanna.casaaccoglienzasantanna.repository;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Maison;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaisonRepository extends JpaRepository<Maison, Long> {
    // Méthodes supplémentaires peuvent être définies ici si nécessaire
}