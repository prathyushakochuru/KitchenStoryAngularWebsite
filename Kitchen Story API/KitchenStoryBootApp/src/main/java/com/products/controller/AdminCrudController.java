package com.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.products.model.Admin;
import com.products.service.AdminCrudService;
import com.products.service.ProductsCrudService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="KicthenStoryAPI", description="This is a KitchenStory API, you can login using admin credentials - manage & add the products")
@RequestMapping("/kitchenstoryapi")
public class AdminCrudController {
	
	@Autowired
	private AdminCrudService adminService;
	
	
	@ApiOperation("You can create a Admin by passing username & pwd and userID will be autogenerated")
	@PostMapping(value = "/admin")
	public String createAdmin(@RequestBody Admin admin) {
		
		 adminService.createAdmin(admin);
		 
		 return "Created admin credentials and saved to mysql-Sportyshoes DB - " + admin.toString();
	}
	
	@PutMapping(value = "/admin/{id}")
	public String updatePwd(@PathVariable(value = "id") int id,@Validated@RequestBody Admin admin) {
		if(admin.getUsername().equals("admin"))
		{
			adminService.updatePwd(id,admin);
			return "Updated Admin password successfully!";
		}
		return "Please log in using Admin credentials!";
	}
	
	@GetMapping("/admin")
	public List<Admin> getAll()
	{
		return adminService.getAll();
	}
	

}
