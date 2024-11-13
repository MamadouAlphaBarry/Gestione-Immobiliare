package org.casaaccoglienza.santanna.casaaccoglienzasantanna.controllers;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Appartamento;
import org.casaaccoglienza.santanna.casaaccoglienzasantanna.services.AppartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/public/appartamenti")
public class AppartamentoPublicController {

    @Autowired
    private AppartamentoService appartamentoService;

    @GetMapping
    public String listAppartamenti(Model model) {
        List<Appartamento> appartamenti = appartamentoService.getAllAppartamenti();
        model.addAttribute("appartamenti", appartamenti);
        return "appartamento/list";
    }
    @GetMapping("/home")
    public String home(Model model) {

        return "home";
    }

    public void image(){}
}
