package com.code.sysrestaurant.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.code.sysrestaurant.Entity.Usuario;
//import com.code.sysrestaurant.Security.JwtUtil;
import com.code.sysrestaurant.Security.JwtUtil;

@RestController
public class HomeController {
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
    private JwtUtil jwtUtil;

	 @PostMapping("/authenticate")
	    public String generateToken(@RequestBody Usuario authRequest) throws Exception {
	        try {
	        	System.out.println(authRequest.getNomuser());
	        	System.out.println(authRequest.getClave());
	            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getNomuser(), authRequest.getClave()));
	        } catch (Exception ex) {
	            throw new Exception("Error: "+ex);
	        }
	        return jwtUtil.generateToken(authRequest.getNomuser());
	    }
}
