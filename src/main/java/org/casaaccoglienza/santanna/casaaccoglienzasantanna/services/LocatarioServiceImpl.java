package org.casaaccoglienza.santanna.casaaccoglienzasantanna.services;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Building;
import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Locatario;
import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Building;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LocatarioServiceImpl implements LocatarioService {
    @Override
    public Locatario saveLocatario(Locatario locatario) {
        return null;
    }

    @Override
    public Optional<Locatario> getLocatarioById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Locatario> getAllLocatari() {
        return List.of();
    }

    @Override
    public void deleteLocatario(Long id) {

    }

    @Override
    public List<Locatario> findByMaison(Building building) {
        return List.of();
    }

    @Override
    public List<Object[]> countContractsByTenant() {
        return List.of();
    }
}
