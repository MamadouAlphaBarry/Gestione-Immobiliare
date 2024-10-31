package org.casaaccoglienza.santanna.casaaccoglienzasantanna.services;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Spesa;

import java.util.List;
import java.util.Optional;

public interface SpesaService {
    Spesa saveSpesa(Spesa spesa);
    Optional<Spesa> getSpesaById(Long id);
    List<Spesa> getAllSpese();
    void deleteSpesa(Long id);
    List<Object[]> sumExpensesByType();
    List<Object[]> countExpensesByHouse();
}
