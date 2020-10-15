package com.code.sysrestaurant.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.code.sysrestaurant.Dao.detalle_pedidoDao;
@Repository
public class detalle_pedidoDaoImp implements detalle_pedidoDao{
	
	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public List<Map<String, Object>> readAll() {
		String SQL = "select * from detalle_pedido";
		return jdbc.queryForList(SQL);
	}

}
