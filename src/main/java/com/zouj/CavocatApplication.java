package com.zouj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.zouj.dao.ClientsRepository;
import com.zouj.entities.Clients;

@SpringBootApplication
public class CavocatApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx= SpringApplication.run(CavocatApplication.class, args);
		ClientsRepository clientsRepository = ctx.getBean(ClientsRepository.class);
		
		//ajout de nouveaux clients dans la bd
		clientsRepository.save(new Clients("zouj", "test", "testadr", "tt@gmai"));
		
	}
}
