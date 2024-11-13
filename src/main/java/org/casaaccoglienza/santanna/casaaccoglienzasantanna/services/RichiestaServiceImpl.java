package org.casaaccoglienza.santanna.casaaccoglienzasantanna.services;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Richiesta;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RichiestaServiceImpl implements RichiestaService {
    @Override
    public Richiesta saveRichiesta(Richiesta richiesta) {
        return null;
    }

    @Override
    public Optional<Richiesta> getRichiestaById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Richiesta> getAllRichieste() {
        return List.of();
    }

    @Override
    public void deleteRichiesta(Long id) {

    }

    @Override
    public List<Object[]> countRequestsByStatus() {
        return List.of();
    }
}
