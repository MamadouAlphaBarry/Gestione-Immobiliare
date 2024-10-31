package org.casaaccoglienza.santanna.casaaccoglienzasantanna.repository;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Contratto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContrattoRepository extends JpaRepository<Contratto, Long> {
    // Méthodes supplémentaires peuvent être définies ici si nécessaire
}