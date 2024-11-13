package org.casaaccoglienza.santanna.casaaccoglienzasantanna.controllers;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.services.ImageStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class ImageUploadController {

    private final ImageStorageService imageStorageService;

    @Autowired
    public ImageUploadController(ImageStorageService imageStorageService) {
        this.imageStorageService = imageStorageService;
    }
@GetMapping("/image")
    public String uploadResult(){
        return "uploadResult";
    }
    @PostMapping("/upload")
    public String uploadImage(@RequestParam("image") MultipartFile imageFile, Model model) {
        try {
            // Appel du service pour stocker l'image
            String fileName = imageStorageService.storeImage(imageFile,"test");
            model.addAttribute("message", "Image uploaded successfully: " + fileName);
            model.addAttribute("imageUrl", "/images/" + fileName);
        } catch (IOException e) {
            model.addAttribute("message", "Failed to upload image: " + e.getMessage());
        }
        return "uploadResult";
    }

}

