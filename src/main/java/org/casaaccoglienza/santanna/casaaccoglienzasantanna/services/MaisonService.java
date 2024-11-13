package org.casaaccoglienza.santanna.casaaccoglienzasantanna.services;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Building;
import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Building;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface MaisonService {
    Building saveMaison(Building building, List<MultipartFile> files, List<String> captions) throws IOException;
    Optional<Building> getMaisonById(Long id);
    List<Building> getAllMaisons();
    void deleteMaison(Long id);
    List<Building> findHousesWithTenants();
    List<Object[]> countApartmentsByHouse();
    Building editBuilding(Long id) throws IOException;
}
