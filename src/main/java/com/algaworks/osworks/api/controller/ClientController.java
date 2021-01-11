package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Client;

@RestController
public class ClientController {
	
	@GetMapping("/clients")
	public List<Client> listar() {
		
		var client1 = new Client();
		client1.setId(1L);
		client1.setName("Milton Belo");
		client1.setEmail("milton.belo@unitel.co.ao");
		client1.setPhone("923300912");
		
		var client2 = new Client();
		client2.setId(2L);
		client2.setName("Mauro Manuel");
		client2.setEmail("masprog2022@gmail.com");
		client2.setPhone("937785806");
		
		return Arrays.asList(client1, client2);
	}

}
