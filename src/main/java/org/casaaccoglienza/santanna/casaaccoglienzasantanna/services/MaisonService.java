package org.casaaccoglienza.santanna.casaaccoglienzasantanna.services;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Maison;

import java.util.List;
import java.util.Optional;

public interface MaisonService {
    Maison saveMaison(Maison maison);
    Optional<Maison> getMaisonById(Long id);
    List<Maison> getAllMaisons();
    void deleteMaison(Long id);
    List<Maison> findHousesWithTenants();
    List<Object[]> countApartmentsByHouse();
}
