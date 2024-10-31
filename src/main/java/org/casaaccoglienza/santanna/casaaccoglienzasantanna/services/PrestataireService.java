package org.casaaccoglienza.santanna.casaaccoglienzasantanna.services;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Prestataire;

import java.util.List;
import java.util.Optional;

public interface PrestataireService {
    Prestataire savePrestataire(Prestataire prestataire);
    Optional<Prestataire> getPrestataireById(Long id);
    List<Prestataire> getAllPrestataires();
    void deletePrestataire(Long id);
    List<Object[]> countWorksByProvider();
}
