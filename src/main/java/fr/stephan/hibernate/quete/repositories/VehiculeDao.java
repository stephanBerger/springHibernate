package fr.stephan.hibernate.quete.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.stephan.hibernate.quete.entities.Vehicule;

@Repository
public interface VehiculeDao extends JpaRepository<Vehicule, Long>{

}
