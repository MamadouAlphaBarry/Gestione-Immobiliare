package org.casaaccoglienza.santanna.casaaccoglienzasantanna.controllers;

import org.casaaccoglienza.santanna.casaaccoglienzasantanna.entities.Appartamento;
import org.casaaccoglienza.santanna.casaaccoglienzasantanna.services.AppartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/appartamenti")
public class AppartamentoController {

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
    @GetMapping("/create")
    public String createAppartamentoForm(Model model) {
        model.addAttribute("appartamento", new Appartamento());
        model.addAttribute("successMessage", "Appartement mis à jour avec succès !");
        return "appartamento/create";
    }

    @PostMapping("/save")
    public String saveAppartamento(@ModelAttribute Appartamento appartamento) {
        appartamentoService.saveAppartamento(appartamento);

        return "redirect:/appartamenti";
    }

    @GetMapping("/edit/{id}")
    public String editAppartamentoForm(@PathVariable Long id, Model model) {
        Appartamento appartamento = appartamentoService.getAppartamentoById(id).orElseThrow(() -> new RuntimeException("Appartamento not found"));
        model.addAttribute("appartamento", appartamento);
        model.addAttribute("successMessage", "Appartement mis à jour avec succès !");
        return "appartamento/edit";
    }

    @PostMapping("/update/{id}")
    public String updateAppartamento(@PathVariable Long id, @ModelAttribute Appartamento appartamento) {
        appartamento.setId(id);
        appartamentoService.saveAppartamento(appartamento);

        return "redirect:/appartamenti";
    }

    @GetMapping("/delete/{id}")
    public String deleteAppartamento(@PathVariable Long id) {
        appartamentoService.deleteAppartamento(id);
        return "redirect:/appartamenti";
    }
    public void image(){}
}
