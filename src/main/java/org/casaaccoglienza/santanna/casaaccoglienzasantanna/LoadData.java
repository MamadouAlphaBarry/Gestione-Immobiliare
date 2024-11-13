package org.casaaccoglienza.santanna.casaaccoglienzasantanna;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Building;
import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Building;
import org.casaaccoglienza.santanna.casaaccoglienzasantanna.repository.MaisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class LoadData implements CommandLineRunner {

    private final MaisonRepository maisonRepository;

    public LoadData(MaisonRepository maisonRepository) {
        this.maisonRepository = maisonRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 1; i < 10; i++) {
         Building building = new Building();
         building.setIndirizzo("Indirizzo " + i);
         building.setCapacita(2+i);
         building.setStato("false");
         maisonRepository.save(building);
        }
    }
}
