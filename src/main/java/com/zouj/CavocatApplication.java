package com.zouj;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.github.javafaker.Faker;
import com.zouj.dao.AvocatsRepository;
import com.zouj.dao.ClientsRepository;
import com.zouj.entities.Avocats;
import com.zouj.entities.Clients;

@SpringBootApplication
public class CavocatApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx= SpringApplication.run(CavocatApplication.class, args);
		ClientsRepository clientsRepository = ctx.getBean(ClientsRepository.class);
		AvocatsRepository avocatsRepository = ctx.getBean(AvocatsRepository.class);

		
		//ajout de 10 nouveaux clients dans la bd a partir d'une boucle fake
		
		for(int i=0; i<10; i++){
			//generation des donnee fake de type locale fr
			Faker fakerClient = new Faker(new Locale("fr"));

			String	 name = fakerClient.name().fullName();
			String prenom = fakerClient.name().firstName(); 
			String adresse = fakerClient.address().streetAddress();
			String email = fakerClient.internet().emailAddress();
			double revenu = fakerClient.number().numberBetween(0, 50000);
			String profession = fakerClient.company().profession();
			
			//creation nouveau client avec data fake
			clientsRepository.save(new Clients(name,prenom,adresse,email,revenu,profession));
		}
		
		 //ajout de nouveaux 10 avocats dans la bd a partir d'une boucle fake
				for(int i=0; i<10; i++){
					//generation des donnee fake de type locale fr
					Faker fakerAvocat = new Faker(new Locale("fr"));

					String	 name = fakerAvocat.name().fullName();
					String prenom = fakerAvocat.name().firstName(); 
					String adresse = fakerAvocat.address().streetAddress();
					String email = fakerAvocat.internet().emailAddress();
					double honoraire = fakerAvocat.number().numberBetween(0, 500);
					String specialite = fakerAvocat.company().buzzword();
					
					//creation nouveau client avec data fake
					avocatsRepository.save(new Avocats(name,prenom,adresse,email,specialite,honoraire));
				}
		
	}
}
