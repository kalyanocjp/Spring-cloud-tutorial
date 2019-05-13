package com.example.ui.service;

import com.example.ui.model.request.UserRequest;
import com.example.ui.model.response.User;

public interface UserService {
	
	public User createUserService(UserRequest userRequest);

}
