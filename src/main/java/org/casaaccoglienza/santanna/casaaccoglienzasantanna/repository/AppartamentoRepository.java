package org.casaaccoglienza.santanna.casaaccoglienzasantanna.repository;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Appartamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppartamentoRepository extends JpaRepository<Appartamento, Long> {
    // Méthodes supplémentaires peuvent être définies ici si nécessaire
}