package org.casaaccoglienza.santanna.casaaccoglienzasantanna.services;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Spesa;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SpesaServiceImpl implements SpesaService {
    @Override
    public Spesa saveSpesa(Spesa spesa) {
        return null;
    }

    @Override
    public Optional<Spesa> getSpesaById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Spesa> getAllSpese() {
        return List.of();
    }

    @Override
    public void deleteSpesa(Long id) {

    }

    @Override
    public List<Object[]> sumExpensesByType() {
        return List.of();
    }

    @Override
    public List<Object[]> countExpensesByHouse() {
        return List.of();
    }
}
