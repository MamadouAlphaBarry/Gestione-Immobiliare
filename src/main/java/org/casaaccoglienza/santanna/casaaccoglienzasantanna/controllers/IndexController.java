package org.casaaccoglienza.santanna.casaaccoglienzasantanna.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller

public class IndexController {
    @GetMapping("/")
    public String index(Model model) {

        return "index";
    }
    @GetMapping("/paralaxe")
    public String index1(){
        return "paralaxe";
    }
    @GetMapping("/index")
    public String index2(){
        return "index1";
    }

    @GetMapping("/detail")
    public String index3(){
        return "appartamento/details";
    }
}
