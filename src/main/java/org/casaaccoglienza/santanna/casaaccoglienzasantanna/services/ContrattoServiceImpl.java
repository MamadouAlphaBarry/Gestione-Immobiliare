package org.casaaccoglienza.santanna.casaaccoglienzasantanna.services;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Contratto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ContrattoServiceImpl implements ContrattoService {
    @Override
    public Contratto saveContratto(Contratto contratto) {
        return null;
    }

    @Override
    public Optional<Contratto> getContrattoById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Contratto> getAllContratti() {
        return List.of();
    }

    @Override
    public void deleteContratto(Long id) {

    }

    @Override
    public List<Object[]> findByLocatarioId(Long locatarioId) {
        return List.of();
    }

    @Override
    public List<Object[]> sumRentByHouse() {
        return List.of();
    }
}
