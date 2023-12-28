package com.irctc.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.main.entity.TrainData;
import com.irctc.main.entity.UserData;
import com.irctc.main.inter.UserInterface;
import com.irctc.main.repository.UserRepo;

@Service
public class UserService implements UserInterface {
	
	@Autowired
	UserRepo userRepo;

	@Override
	public void addUser(UserData userData) {
		// TODO Auto-generated method stub
		userRepo.save(userData);
		
	}

	@Override
	public List<UserData> getUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public void deleteUserById(Long Id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(Id);
	}

	@Override
	public void updateUser(UserData updatedUser) {
		// TODO Auto-generated method stub
		Long userId=updatedUser.getUserId();
		
		Optional<UserData> existingUserOptional=userRepo.findById(userId);
		if (existingUserOptional.isPresent()) {
            UserData existingUser = existingUserOptional.get();

            // Update the properties of the existing train with the values from the updated train
            existingUser.setFirstName(updatedUser. getFirstName());
            existingUser.setLastName(updatedUser. getLastName() );
            existingUser.setUserGender(updatedUser.getUserGender());
            existingUser.setUserAge(updatedUser.getUserAge());
            existingUser.setUserCity(updatedUser.getUserCity());
            existingUser.setUserEmail(updatedUser.getUserEmail());
            existingUser.setUserPassword(updatedUser.getUserPassword());// Assuming you want to update stations as well

            // Save the updated train
            userRepo.save(existingUser);
            System.out.println("Data updated");
            
        } else {
            // Handle the case where the train with the given ID does not exist
            throw new RuntimeException("Train with ID " + userId + " not found.");
        }
		
	}

	@Override
	public boolean userAuthenticate(UserData userData) {
		UserData existingUserData = userRepo.findUserByUserEmailAndUserPassword(userData.getUserEmail(), userData.getUserPassword());
		if(existingUserData != null ) {
			String existingUserEmail = existingUserData.getUserEmail();
			String existingUserPassword = existingUserData.getUserPassword();
			
			if(userData.getUserEmail().equals(existingUserEmail) && userData.getUserPassword().equals(existingUserPassword)){
				System.out.println("match found for useremail "+ existingUserEmail);
				return true;
			}else {
				return false;
			}
			
			
			
		}else {return false;}
			

	}
		
}