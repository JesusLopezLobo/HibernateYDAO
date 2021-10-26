package com.nttdata.hibernate1.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.hibernate1.persistence.Client;
import com.nttdata.hibernate1.persistence.ClienteDAO;

@Service
public class ClientServiceImpl implements ClientServiceI {
	
	@Autowired
	private ClienteDAO clientDao;
	
	@Override
	@Transactional
	public void insertNewClient(final Client newClient) {
		
		if(newClient != null && newClient.getClienteId() == null) {
			// Insertar nuevo cliente.
			clientDao.insert(newClient);
		}
		
	}

	@Override
	public void updateNewClient(Client updClient) {
		if(updClient != null && updClient.getClienteId() != null) {
			// Insertar nuevo cliente.
			clientDao.update(updClient);
		}
		
	}

	@Override
	public void deleteNewClient(Client delClient) {
		if(delClient != null && delClient.getClienteId() != null) {
			// Insertar nuevo cliente.
			clientDao.delete(delClient);
		}
		
	}

	@Override
	public Client searchById(final Long clientId) {
		
		Client cliente;
		
		//if(clienteId)
		
		return null;
		
	}

	@Override
	public List<Client> searchByFullName(String name, String surname1, String surname2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> searchAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
