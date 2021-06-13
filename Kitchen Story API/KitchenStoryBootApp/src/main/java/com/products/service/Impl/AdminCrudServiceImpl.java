package com.products.service.Impl;

import java.util.List;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.model.Admin;
import com.products.repository.AdminRepository;
import com.products.service.AdminCrudService;

@Service
//@Transactional
public class AdminCrudServiceImpl implements AdminCrudService{
	
	@Autowired
	private AdminRepository adminRepo;

	@Override
	public Admin createAdmin(Admin admin) {
		
		return adminRepo.save(admin);
	}

	@Override
	public Admin updatePwd(int id, Admin admin) {
		Admin existingAdmin = adminRepo.findById(id).get();
		existingAdmin.setPassword(admin.getPassword());
		return adminRepo.save(existingAdmin);
	}

	@Override
	public List<Admin> getAll() {
		// TODO Auto-generated method stub
		return adminRepo.findAll();
	}

}
