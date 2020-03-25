package com.carlos.rocketseat.omnistack11.backendOmnistack11.resources;

import com.carlos.rocketseat.omnistack11.backendOmnistack11.models.Ong;
import com.carlos.rocketseat.omnistack11.backendOmnistack11.repository.OngRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class OngResources {

    @Autowired
    OngRepository ongRepository;

    @GetMapping("/ongs"  )
    public Page<Ong> indexPost(@RequestParam(defaultValue = "0") int page){

        Pageable newPage = PageRequest.of(page, 5);
        return ongRepository.findAll(newPage);
    }

    @PostMapping("/ongs")
    public Ong storePost(@RequestBody Ong ong) {
        return ongRepository.save(ong);
    }
}
