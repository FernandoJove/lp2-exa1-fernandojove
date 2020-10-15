package com.code.sysrestaurant.Dao;

import org.springframework.stereotype.Repository;


import com.code.sysrestaurant.Entity.Usuario;


public interface UsuarioDao {

	public Usuario read(String nomuser );
	
}
