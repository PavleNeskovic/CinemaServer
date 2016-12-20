package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;

	private final RoleService roleService;

	@Autowired
	public UserService(UserRepository userRepository, RoleService roleService) {
		this.userRepository = userRepository;
		this.roleService = roleService;
	}
	
	/**
	 * Get User by user email
	 * 
	 * @param email
	 *            of current User
	 * @return Optional<User>
	 */
	public Optional<User> getUserByEmail(String email) {
		return userRepository.findOneByEmail(email);
	}

}
