package com.nttdata.hibernate1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.hibernate1.persistence.Client;
import com.nttdata.hibernate1.services.ClientServiceI;



@SpringBootApplication
public class Desafio1Application {
	
	@Autowired
	private ClientServiceI clientService;
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}
	
	//@Override
	public void run(String... args) throws Exception {
		
		// Nuevo cliente
		Client cliente1 = new Client();
		cliente1.setName("Jesus");
		cliente1.setFirstSurname("Lopez");
		cliente1.setSecondSurname("Lobo");
		cliente1.setDni("12345678T");
		
		clientService.insertNewClient(cliente1);
	}

}
