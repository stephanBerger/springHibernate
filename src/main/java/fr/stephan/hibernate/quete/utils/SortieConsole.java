package fr.stephan.hibernate.quete.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import fr.stephan.hibernate.quete.entities.Vehicule;
import fr.stephan.hibernate.quete.repositories.VehiculeDao;

@Component
public class SortieConsole implements CommandLineRunner{
	
	private Logger LOG = LoggerFactory.getLogger("Stephan BERGER represent:");
	
	@Autowired
	private VehiculeDao vehiculeDao;
	
	
	@Override
	public void run(String... args) throws Exception {

		LOG.info("**************************************");
        LOG.info("Objects in DB : " + vehiculeDao.count());
        Vehicule voiture1 = new Vehicule("Peugeot","504",13);
        LOG.info("***************************************");
        LOG.info(voiture1 + " a été créer!");
        vehiculeDao.save(voiture1);
        LOG.info(voiture1 + " has been saved !");
        
        Vehicule voiture2 = new Vehicule("Renaud","R12",3);
        LOG.info("***************************************");
        LOG.info(voiture2 + " a été créer!");
        vehiculeDao.save(voiture2);
        LOG.info(voiture2 + " has been saved !");
        Vehicule voiture3 = new Vehicule("Scoda","Fabia",8);
        LOG.info("***************************************");
        LOG.info(voiture3 + " a été créer!");
        vehiculeDao.save(voiture3);
        LOG.info(voiture3 + " has been saved !");
        
        Vehicule tempVoiture = vehiculeDao.findById(2L).get();
        LOG.info("******************************************");
        LOG.info("La marque du véhicule est: " + tempVoiture.getBrand());
        LOG.info("Le modèle du véhicule est: " + tempVoiture.getModel());
        LOG.info("Le nombre de chevaux est de: " + tempVoiture.getHorsePower());
        
        for(Vehicule vv : vehiculeDao.findAll()) {
            LOG.info(vv.toString());
        };
       
        vehiculeDao.deleteById(2L);
       
        for(Vehicule vv : vehiculeDao.findAll()) {
            LOG.info(vv.toString());
        };
        
        
        
       
        
        
        
        
		
		
	}
	
}
