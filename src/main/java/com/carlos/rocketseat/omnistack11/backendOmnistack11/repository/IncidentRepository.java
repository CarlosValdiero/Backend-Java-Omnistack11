package com.carlos.rocketseat.omnistack11.backendOmnistack11.repository;


import com.carlos.rocketseat.omnistack11.backendOmnistack11.models.Incident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidentRepository extends JpaRepository<Incident,Long> {

}
