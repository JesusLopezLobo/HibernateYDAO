package com.nttdata.hibernate1.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contract {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long contractId;
	
	@Column(name = "NAME", nullable = false)
	private String name;
	
	
	
}
