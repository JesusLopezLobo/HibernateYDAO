package com.nttdata.hibernate1.persistence;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClientDAOImpl implements ClienteDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void insert(Client newClient) {
		
		// Inicio de sesión.
		Session currentSession = entityManager.unwrap(Session.class);
		
		// Apertura de transacción.
		//currentSession.getTransaction().begin();
		
		// Insercción.
		currentSession.save(newClient);
		
		// Cierre de sesión.
		currentSession.close();
		
	}

	@Override
	public void update(Client updClient) {
		
		// Inicio de sesión.
		Session currentSession = entityManager.unwrap(Session.class);
		
		// Apertura de transacción.
		//currentSession.getTransaction().begin();
		
		// Insercción.
		currentSession.saveOrUpdate(updClient);
		
		// Cierre de sesión.
		currentSession.close();
		
	}

	@Override
	public void delete(Client delClient) {
		
		// Inicio de sesión.
				Session currentSession = entityManager.unwrap(Session.class);
				
				// Apertura de transacción.
				//currentSession.getTransaction().begin();
				
				// Insercción.
				currentSession.delete(delClient);
				
				// Cierre de sesión.
				currentSession.close();
				
		
	}

	@Override
	public Client searchById(int customerId) {
		// Inicio de sesión.
		Session currentSession = entityManager.unwrap(Session.class);
		
		// Apertura de transacción.
		//currentSession.getTransaction().begin();
		
		// Insercción.
		Client result = currentSession.get(Client.class, currentSession);
		
		// Cierre de sesión.
		currentSession.close();
		
		return result;
	}

	@Override
	public List<Client> searchAll() {
		// Inicio de sesión.
		Session currentSession = entityManager.unwrap(Session.class);
		
		// Apertura de transacción.
		//currentSession.getTransaction().begin();
		
		// Insercción.
		List<Client> list = currentSession.createQuery("FROM Client").list();
		
		// Cierre de sesión.
		currentSession.close();
		
		return list;
	}

	@Override
	public List<Client> searchByCustomerFullName(String name, String surname1, String surname2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
