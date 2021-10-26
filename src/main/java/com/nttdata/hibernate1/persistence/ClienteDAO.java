package com.nttdata.hibernate1.persistence;

import java.util.List;

public interface ClienteDAO {
	
	public void insert(Client newClient);
	
	public void update(Client updClient);
	
	public void delete(Client delClient);
	
	public Client searchById(final int customerId);
	
	public List<Client> searchAll();
	
	public List<Client> searchByCustomerFullName(final String name, final String surname1, final String surname2);
	
}
