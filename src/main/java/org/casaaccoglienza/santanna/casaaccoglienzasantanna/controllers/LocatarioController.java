package org.casaaccoglienza.santanna.casaaccoglienzasantanna.controllers;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Locatario;
import org.casaaccoglienza.santanna.casaaccoglienzasantanna.services.LocatarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/locatari")
public class LocatarioController {

    @Autowired
    private LocatarioService locatarioService;

    @GetMapping
    public String listLocatari(Model model) {
        List<Locatario> locatari = locatarioService.getAllLocatari();
        model.addAttribute("locatari", locatari);
        return "locatario/list";
    }

    @GetMapping("/create")
    public String createLocatarioForm(Model model) {
        model.addAttribute("locatario", new Locatario());
        return "locatario/create";
    }

    @PostMapping("/save")
    public String saveLocatario(@ModelAttribute Locatario locatario) {
        locatarioService.saveLocatario(locatario);
        return "redirect:/locatari";
    }

}
