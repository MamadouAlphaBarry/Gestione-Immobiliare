package org.casaaccoglienza.santanna.casaaccoglienzasantanna.services;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Lavoro;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LavoroServiceImpl implements LavoroService {
    @Override
    public Lavoro saveLavoro(Lavoro lavoro) {
        return null;
    }

    @Override
    public Optional<Lavoro> getLavoroById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Lavoro> getAllLavori() {
        return List.of();
    }

    @Override
    public void deleteLavoro(Long id) {

    }

    @Override
    public List<Object[]> sumWorkCostsByHouse() {
        return List.of();
    }

    @Override
    public List<Object[]> countWorksByProvider() {
        return List.of();
    }
}
