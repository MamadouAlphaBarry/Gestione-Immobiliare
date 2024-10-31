package org.casaaccoglienza.santanna.casaaccoglienzasantanna.services;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Contratto;

import java.util.List;
import java.util.Optional;

public interface ContrattoService {
    Contratto saveContratto(Contratto contratto);
    Optional<Contratto> getContrattoById(Long id);
    List<Contratto> getAllContratti();
    void deleteContratto(Long id);
    List<Object[]> findByLocatarioId(Long locatarioId);
    List<Object[]> sumRentByHouse();
}
