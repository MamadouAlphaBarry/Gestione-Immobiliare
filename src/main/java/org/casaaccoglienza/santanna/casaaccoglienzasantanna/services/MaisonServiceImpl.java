package org.casaaccoglienza.santanna.casaaccoglienzasantanna.services;

import lombok.AllArgsConstructor;
import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Building;
import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Building;
import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Image;
import org.casaaccoglienza.santanna.casaaccoglienzasantanna.repository.ImageRepository;
import org.casaaccoglienza.santanna.casaaccoglienzasantanna.repository.MaisonRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class MaisonServiceImpl implements MaisonService {
    private final ImageRepository imageRepository;
    private MaisonRepository maisonRepository;
    private ImageStorageService imageStorageService;
    @Override
    public Building saveMaison(Building building, List<MultipartFile> files, List<String> captions) throws IOException {
        Building savedBuilding = maisonRepository.save(building);
       // System.out.println("images: " + files.get);
        List<Image> images = new ArrayList<>();
        for (int i = 0; i < files.size(); i++) {
            MultipartFile file = files.get(i);
            String caption=captions.get(i);
            String fileName=file.getOriginalFilename();
            String dir=caption+"_"+ UUID.randomUUID().toString();
            String extension=file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
            imageStorageService.storeImage(file,dir);
            images.add(Image.builder().url("/images/building/"+dir+"."+extension).caption(caption).building(building).build());
            String url= "/images/building/"+dir+"."+extension;
            System.out.println("******************************:::"+ (long) images.size());

           // imageRepository.save(image);
        }
        for (Image image : images) {
            System.out.println(image.toString());
        }
        imageRepository.saveAll(images);
        return savedBuilding;
    }

    @Override
    public Optional<Building> getMaisonById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Building> getAllMaisons() {
        return maisonRepository.findAll();
    }

    @Override
    public void deleteMaison(Long id) {
            maisonRepository.deleteById(id);
    }

    @Override
    public List<Building> findHousesWithTenants() {
        return List.of();
    }

    @Override
    public List<Object[]> countApartmentsByHouse() {
        return List.of();
    }

    @Override
    public Building editBuilding(Long id) throws IOException {
        Building findedBuilding = maisonRepository.findById(id).get();
        if (findedBuilding == null) {
            throw new FileNotFoundException("Building not found");
        }
        return maisonRepository.save(findedBuilding);
    }
}
