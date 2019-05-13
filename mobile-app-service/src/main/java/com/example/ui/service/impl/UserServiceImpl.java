package com.example.ui.service.impl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.ui.model.request.UserRequest;
import com.example.ui.model.response.User;
import com.example.ui.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public User createUserService(UserRequest userRequest) {
		User user = new User();
		String userId = UUID.randomUUID().toString();
		user.setEmaiId(userRequest.getEmaiId());
		user.setFName(userRequest.getFName());
		user.setLName(userRequest.getLName());
		user.setUserId(userId);
		return user;
	}

}
