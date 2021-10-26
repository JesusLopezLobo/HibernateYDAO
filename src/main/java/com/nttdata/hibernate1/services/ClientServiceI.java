package com.nttdata.hibernate1.services;

import java.util.List;

import com.nttdata.hibernate1.persistence.Client;
import com.nttdata.hibernate1.persistence.ClienteDAO;

public interface ClientServiceI {
	
	public void insertNewClient(final Client newClient);
	
	public void updateNewClient(final Client updClient);
	
	public void deleteNewClient(final Client delClient);
	
	public Client searchById(final Long clientId);
	
	public List<Client> searchByFullName(final String name, final String surname1, final String surname2);
	
	public List<Client> searchAll();

	//void insertNewClient(ClienteDAO newClient);
}
