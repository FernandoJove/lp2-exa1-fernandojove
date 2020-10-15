package com.code.sysrestaurant;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.code.sysrestaurant.Dao.detalle_pedidoDao;

@SpringBootTest
class Lp2Exa1FernandojoveApplicationTests {
	
	@Autowired
	private detalle_pedidoDao dpdao;

	@Test
	void contextLoads() {
		System.out.println(dpdao.readAll());
	}

}
