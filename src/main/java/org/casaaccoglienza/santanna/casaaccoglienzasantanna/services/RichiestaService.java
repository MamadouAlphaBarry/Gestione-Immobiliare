package org.casaaccoglienza.santanna.casaaccoglienzasantanna.services;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Richiesta;

import java.util.List;
import java.util.Optional;

public interface RichiestaService {
    Richiesta saveRichiesta(Richiesta richiesta);
    Optional<Richiesta> getRichiestaById(Long id);
    List<Richiesta> getAllRichieste();
    void deleteRichiesta(Long id);
    List<Object[]> countRequestsByStatus();
}
