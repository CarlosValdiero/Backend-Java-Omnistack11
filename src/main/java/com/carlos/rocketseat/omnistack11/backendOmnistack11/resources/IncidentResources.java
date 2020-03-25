package com.carlos.rocketseat.omnistack11.backendOmnistack11.resources;

import com.carlos.rocketseat.omnistack11.backendOmnistack11.models.Incident;
import com.carlos.rocketseat.omnistack11.backendOmnistack11.repository.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class IncidentResources {

    @Autowired
    IncidentRepository incidentRepository;

    @GetMapping("/incidents"  )
    public Page<Incident> indexPost(@RequestParam(defaultValue = "0") int page){

        Pageable newPage = PageRequest.of(page, 5);
        return incidentRepository.findAll(newPage);
    }

    @PostMapping("/incidents")
    public Incident storePost(@RequestBody Incident incident) {

        return incidentRepository.save(incident);
    }
}
