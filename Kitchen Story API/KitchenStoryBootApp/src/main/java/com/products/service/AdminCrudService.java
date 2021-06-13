package com.products.service;

import java.util.List;

import com.products.model.Admin;

public interface AdminCrudService {
	
	public Admin createAdmin(Admin admin);
	public Admin updatePwd(int id, Admin admin);
	public List<Admin> getAll();

}
