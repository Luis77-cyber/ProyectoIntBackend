package com.proyecto_integrador.proyecto_integrador.security.entity;

import javax.persistence.*;
import com.proyecto_integrador.proyecto_integrador.security.enums.RolNombre;

@Entity
public class Rol {
	@Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	@Enumerated(EnumType.STRING)
	private RolNombre rolNombre;

	
	public Rol() {
	}

	public Rol(RolNombre rolNombre) {
		super();
		this.rolNombre = rolNombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RolNombre getRolNombre() {
		return rolNombre;
	}

	public void setRolNombre(RolNombre rolNombre) {
		this.rolNombre = rolNombre;
	}
	
}
