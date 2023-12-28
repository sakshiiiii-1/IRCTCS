package com.irctc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.main.entity.Admin;
import com.irctc.main.service.AdminService;

@CrossOrigin("*")
@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@PostMapping("/authenticate")
	public boolean authenticateAdmin(@RequestBody Admin adminDetails) {
		System.out.println(adminDetails);
		return adminService.authenticateAdmin(adminDetails);
	}
}
