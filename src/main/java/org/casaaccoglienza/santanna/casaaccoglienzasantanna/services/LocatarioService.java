package org.casaaccoglienza.santanna.casaaccoglienzasantanna.services;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Building;
import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Locatario;
import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Building;

import java.util.List;
import java.util.Optional;

public interface LocatarioService {
    Locatario saveLocatario(Locatario locatario);
    Optional<Locatario> getLocatarioById(Long id);
    List<Locatario> getAllLocatari();
    void deleteLocatario(Long id);
    List<Locatario> findByMaison(Building building);
    List<Object[]> countContractsByTenant();
}
