package org.casaaccoglienza.santanna.casaaccoglienzasantanna.services;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Lavoro;

import java.util.List;
import java.util.Optional;

public interface LavoroService {
    Lavoro saveLavoro(Lavoro lavoro);
    Optional<Lavoro> getLavoroById(Long id);
    List<Lavoro> getAllLavori();
    void deleteLavoro(Long id);
    List<Object[]> sumWorkCostsByHouse();
    List<Object[]> countWorksByProvider();
}
