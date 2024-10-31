package org.casaaccoglienza.santanna.casaaccoglienzasantanna.services;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Appartamento;

import java.util.List;
import java.util.Optional;

public interface AppartamentoService {
    Appartamento saveAppartamento(Appartamento appartamento);
    Optional<Appartamento> getAppartamentoById(Long id);
    List<Appartamento> getAllAppartamenti();
    void deleteAppartamento(Long id);
    List<Object[]> findApartmentsWithContractCount(Long maisonId);
}
