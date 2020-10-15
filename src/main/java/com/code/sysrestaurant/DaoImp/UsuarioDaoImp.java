package com.code.sysrestaurant.DaoImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.code.sysrestaurant.Dao.UsuarioDao;
import com.code.sysrestaurant.Entity.Usuario;

@Repository
public class UsuarioDaoImp implements UsuarioDao{
	
	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public Usuario read(String nomuser) {
		String SQL="select * from usuario where nomuser = ?";
	  return jdbc.queryForObject(SQL, new Object[] {nomuser}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	
	}
	
}
