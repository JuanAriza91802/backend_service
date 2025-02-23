
package com.ariza.miprueba.services;

import com.ariza.miprueba.models.Visit;
import com.ariza.miprueba.repository.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service 
public class VisitService {

    @Autowired
    private VisitRepository visitRepository;

    // Método para incrementar el contador de visitas
    public Visit incrementVisitCounter() {
        
        Optional<Visit> visitOptional = visitRepository.findById(1L); 

        Visit visit;
        if (visitOptional.isPresent()) {
            visit = visitOptional.get();
            visit.setCount(visit.getCount() + 1);
        } else {
            visit = new Visit(true);
            visit.setCount(1); 
        }

        return visitRepository.save(visit);
    }
    
    // Método para obtener el contador de visitas
    public Visit getVisitData() {
        Optional<Visit> visit = visitRepository.findById(1L);
        if (visit.isEmpty()) {
            return null; // O puedes crear una nueva visita con valores predeterminados
        } else {
            return visit.get();
        }
    }
    
    // Método para actualizar el valor de isDevelop
    public Visit updateDevelopMode(boolean isDevelop) {
        Optional<Visit> visitOptional = visitRepository.findById(1L);

        Visit visit;
        if (visitOptional.isPresent()) {
            visit = visitOptional.get();
            visit.setIsDevelop(isDevelop);
        } else {
            visit = new Visit(isDevelop);
            visit.setCount(0);
        }

        return visitRepository.save(visit);
    }
}