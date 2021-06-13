package com.products.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.products.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{
	
	

}
