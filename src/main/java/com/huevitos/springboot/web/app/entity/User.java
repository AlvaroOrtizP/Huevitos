package com.huevitos.springboot.web.app.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class User {
	
	@Id
	private BigDecimal usuarioId;
	
	private String algo;
	
	private String algo2;
}
