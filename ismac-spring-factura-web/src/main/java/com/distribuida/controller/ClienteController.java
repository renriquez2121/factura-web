package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.distribuida.dto.ClienteService;
import com.distribuida.entities.Cliente;


@Controller
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/findAll")
	public String findAll(Model model) {
		
		List<Cliente> clientes = clienteService.findAll();
		model.addAttribute("clientes", clientes);
		return "clientes-listar";
	}
}
