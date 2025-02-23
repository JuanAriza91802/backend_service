package com.ariza.miprueba.controllers;


import com.ariza.miprueba.models.Visit;
import com.ariza.miprueba.services.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/visits")
public class VisitController {
    @Autowired
    private VisitService visitService;
    
    // Endpoint para incrementar el contador de visitas
    @PostMapping("/increment")
    public Visit incrementVisit() {
        return visitService.incrementVisitCounter();
    }
    
    // Endpoint para extraer el valor 
    @GetMapping("/increment")
    public Visit getVists(){
        return visitService.getVisitData();
    }
  

    // Endpoint para actualizar el valor de isDevelop
    @PutMapping("/update-mode")
    public Visit updateDevelopMode(@RequestParam boolean isDevelop) {
        return visitService.updateDevelopMode(isDevelop);
    }
    
}