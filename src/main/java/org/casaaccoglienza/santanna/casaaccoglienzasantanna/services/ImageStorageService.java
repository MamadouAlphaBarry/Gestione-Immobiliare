package org.casaaccoglienza.santanna.casaaccoglienzasantanna.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class ImageStorageService {
    public final String uploadDir = "src/main/resources/static/images/";
   public String storeImage(MultipartFile image,String basename) throws IOException {
        if (image.isEmpty()) {
            throw new IOException("File is empty");
        }
        if(!image.getContentType().startsWith("image")) {
            throw new IOException("File is not an image");
        }
        String filename = basename+"_"+image.getOriginalFilename();
       Path targetLocation= Paths.get(uploadDir).toAbsolutePath().normalize().resolve(filename);
       Files.createDirectories(targetLocation.getParent());
       Files.copy(image.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
       return filename;
   }
}
