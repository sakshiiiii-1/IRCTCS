package com.irctc.main.inter;

import java.util.List;

import com.irctc.main.entity.UserData;

public interface UserInterface {
	
	public void addUser(UserData userData);
	
	public List<UserData> getUser();
	
	public void deleteUserById(Long Id);
	
	public void updateUser(UserData updatedUser);
	
	public boolean userAuthenticate(UserData userData);
}

