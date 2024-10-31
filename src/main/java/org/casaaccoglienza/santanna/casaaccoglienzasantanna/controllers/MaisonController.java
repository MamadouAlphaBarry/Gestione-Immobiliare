package org.casaaccoglienza.santanna.casaaccoglienzasantanna.controllers;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Maison;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/maisons")
public class MaisonController {

    @Autowired
    private MaisonService maisonService;

    @GetMapping
    public String listMaisons(Model model) {
        List<Maison> maisons = maisonService.getAllMaisons();
        model.addAttribute("maisons", maisons);
        return "maison/list";
    }

    @GetMapping("/create")
    public String createMaisonForm(Model model) {
        model.addAttribute("maison", new Maison());
        return "maison/create";
    }

    @PostMapping("/save")
    public String saveMaison(@ModelAttribute Maison maison) {
        maisonService.saveMaison(maison);
        return "redirect:/maisons";
    }

    @GetMapping("/edit/{id}")
    public String editMaisonForm(@PathVariable Long id, Model model) {
        Maison maison = maisonService.getMaisonById(id).orElseThrow(() -> new RuntimeException("Maison not found"));
        model.addAttribute("maison", maison);
        return "maison/edit";
    }

    @PostMapping("/update/{id}")
    public String updateMaison(@PathVariable Long id, @ModelAttribute Maison maison) {
        maison.setId(id);
        maisonService.saveMaison(maison);
        return "redirect:/maisons";
    }

    @GetMapping("/delete/{id}")
    public String deleteMaison(@PathVariable Long id) {
        maisonService.deleteMaison(id);
        return "redirect:/maisons";
    }
}
