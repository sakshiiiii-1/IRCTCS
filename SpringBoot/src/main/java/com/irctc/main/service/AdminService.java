package com.irctc.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.main.entity.Admin;
import com.irctc.main.entity.TrainData;
import com.irctc.main.repository.AdminRepo;

@Service
public class AdminService {
	@Autowired
	AdminRepo adminRepo;

	 public boolean authenticateAdmin(Admin adminDetails) {
	        // Check if the admin with the given name exists
		 	
	        Optional<Admin> existingAdminDetails = adminRepo.findByAdminName(adminDetails.getAdminName());

	        if (existingAdminDetails.isPresent()) {
	            // Admin exists, now check if the password matches
	            Admin admin = existingAdminDetails.get();
	            String existingAdminName = admin.getAdminName();
	            String existingPassword = admin.getAdminPass(); // Assuming you have a method like getPassword() in your Admin class
	            
	            // You might want to use a secure password hashing mechanism here
	            // For simplicity, I'm assuming plain text comparison for demonstration purposes
	            if (adminDetails.getAdminPass().equals(existingPassword) && adminDetails.getAdminName().equals(existingAdminName)  ) {
	                // Passwords match, authentication successful
	            	System.out.println("UserName Matched " + existingAdminName);
	            	System.out.println("PasWord Matched " + existingPassword);
	            	
	                return true;
	            } else {
	                // Passwords don't match, authentication failed
	            	System.out.println("Password does not match");
	                return false;
	            }
	        } else {
	            // Admin with the given name doesn't exist, authentication failed
	        	System.out.println("Admin does not exist in DataBase");
	            return false;
	        }
      
	 		}
	 
}