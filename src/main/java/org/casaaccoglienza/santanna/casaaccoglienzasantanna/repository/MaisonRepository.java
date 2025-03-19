package org.casaaccoglienza.santanna.casaaccoglienzasantanna.repository;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Building;
import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Building;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaisonRepository extends JpaRepository<Building, Long> {
    // Méthodes supplémentaires peuvent être définies ici si nécessaire
}