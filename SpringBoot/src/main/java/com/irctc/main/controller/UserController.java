package com.irctc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.main.entity.StationData;
import com.irctc.main.entity.UserData;
import com.irctc.main.inter.UserInterface;

@CrossOrigin("*")
@RestController
@RequestMapping("/users")
public class UserController {
	
		private final UserInterface userInterface;
		
		@Autowired
		public UserController(UserInterface userInterface) {
			this.userInterface=userInterface;
		}
		
		@PostMapping("/addUsers")
		public void addStations(@RequestBody UserData user) {
			System.out.println(user);
			userInterface.addUser(user);	
		}
		
		@GetMapping("/getUsers")
		public List<UserData> getUsersData(){
			return userInterface.getUser();
		}
		
		@PostMapping("/userAuthenticate")
		public boolean userAuthenticate(@RequestBody UserData userData) {
			if(userData != null){
				System.out.println(userData);
				return userInterface.userAuthenticate(userData);
			}else {
				System.out.println("details are Null");
				return false;
				
			}
		}
		
		
}
