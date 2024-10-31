package org.casaaccoglienza.santanna.casaaccoglienzasantanna.repository;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Richiesta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RichiestaRepository extends JpaRepository<Richiesta, Long> {
    // Méthodes supplémentaires peuvent être définies ici si nécessaire
}