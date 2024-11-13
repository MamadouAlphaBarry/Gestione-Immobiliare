package org.casaaccoglienza.santanna.casaaccoglienzasantanna.controllers;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Building;
import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Building;
import org.casaaccoglienza.santanna.casaaccoglienzasantanna.services.MaisonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.List;

@Controller
@RequestMapping("/maisons")
public class MaisonController {

    @Autowired
    private MaisonService maisonService;

    @GetMapping
    public String listMaisons(Model model) {
        List<Building> buildings = maisonService.getAllMaisons();
        int totalMaisons= buildings.size();
        model.addAttribute("maisons", buildings);
        model.addAttribute("totalMaisons", totalMaisons);
        return "maison/list";
    }

    @GetMapping("/create")
    public String createMaisonForm(Model model) {
        model.addAttribute("maison", new Building());
        return "maison/create";
    }

    @PostMapping("/save")
    public String saveMaison(
            @ModelAttribute Building building,
            @RequestParam("files") List<MultipartFile> files,
            @RequestParam("captions") List<String> captions) throws IOException {
        maisonService.saveMaison(building, files, captions);
        return "redirect:/maisons";
    }

    @GetMapping("/edit/{id}")
    public String editMaisonForm(@PathVariable Long id, Model model) throws IOException {
        Building building = maisonService.editBuilding(id);
        if (building == null) {
                throw new RemoteException("Not valid building");
        }
        model.addAttribute("maison", building);
        return "maison/edit";
    }

    @PostMapping("/update/{id}")
    public String updateMaison(@PathVariable Long id, @ModelAttribute Building building, List<MultipartFile> files, List<String> captions) throws IOException {
        building.setId(id);
       maisonService.saveMaison(building,files,captions);
        return "redirect:/maisons";
    }

    @GetMapping("/delete/{id}")
    public String deleteMaison(@PathVariable Long id) {
        maisonService.deleteMaison(id);
        return "redirect:/maisons";
    }
}
