package org.casaaccoglienza.santanna.casaaccoglienzasantanna.repository;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Lavoro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LavoroRepository extends JpaRepository<Lavoro, Long> {
    // Méthodes supplémentaires peuvent être définies ici si nécessaire
}