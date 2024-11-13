package org.casaaccoglienza.santanna.casaaccoglienzasantanna.services;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Prestataire;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PrestataireServiceImpl implements PrestataireService {
    @Override
    public Prestataire savePrestataire(Prestataire prestataire) {
        return null;
    }

    @Override
    public Optional<Prestataire> getPrestataireById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Prestataire> getAllPrestataires() {
        return List.of();
    }

    @Override
    public void deletePrestataire(Long id) {

    }

    @Override
    public List<Object[]> countWorksByProvider() {
        return List.of();
    }
}
