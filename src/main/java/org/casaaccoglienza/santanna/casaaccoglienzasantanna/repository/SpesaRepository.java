package org.casaaccoglienza.santanna.casaaccoglienzasantanna.repository;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Spesa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpesaRepository extends JpaRepository<Spesa, Long> {
    // Méthodes supplémentaires peuvent être définies ici si nécessaire
}