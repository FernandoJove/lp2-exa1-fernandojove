package com.code.sysrestaurant.Controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.sysrestaurant.Service.detalle_pedidoService;

@RestController
@RequestMapping("/detalle_pedido")
public class detalle_pedidoController {
	
	@Autowired
	private detalle_pedidoService dpService;
	
	@GetMapping("/lista")
	public List<Map<String,Object>> listar(){
		
		return dpService.readAll();
	}
}
