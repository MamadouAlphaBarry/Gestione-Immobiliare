package org.casaaccoglienza.santanna.casaaccoglienzasantanna.services;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Appartamento;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AppartamentoServiceImpl implements AppartamentoService {
    @Override
    public Appartamento saveAppartamento(Appartamento appartamento) {
        return null;
    }

    @Override
    public Optional<Appartamento> getAppartamentoById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Appartamento> getAllAppartamenti() {
        return List.of();
    }

    @Override
    public void deleteAppartamento(Long id) {

    }

    @Override
    public List<Object[]> findApartmentsWithContractCount(Long maisonId) {
        return List.of();
    }
}
