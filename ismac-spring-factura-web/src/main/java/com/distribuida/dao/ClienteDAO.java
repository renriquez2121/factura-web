package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Cliente;

public interface ClienteDAO {
	//CRUD: CREATE,READ,UPDATE,DELETE
	//(ADD),(FIND-SELECT),(UP),(DEL)	
	
	public List<Cliente> findAll();
	
	public Cliente findOne(int id);
	
	public void add(Cliente cliente);
	
	public void up(Cliente Cliente);
	
	public void del(int id);

}
