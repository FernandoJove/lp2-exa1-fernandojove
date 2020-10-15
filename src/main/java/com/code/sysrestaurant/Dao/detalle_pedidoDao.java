package com.code.sysrestaurant.Dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository 
public interface detalle_pedidoDao {
	
	List<Map<String,Object>> readAll();
	
}
