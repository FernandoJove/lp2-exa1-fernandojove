	package com.code.sysrestaurant.ServiceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.sysrestaurant.Dao.detalle_pedidoDao;
import com.code.sysrestaurant.Service.detalle_pedidoService;

@Service
public class detalle_pedidoServiceImp implements detalle_pedidoService {

	@Autowired
	private detalle_pedidoDao dpDao;
	
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return dpDao.readAll();
	}

}
