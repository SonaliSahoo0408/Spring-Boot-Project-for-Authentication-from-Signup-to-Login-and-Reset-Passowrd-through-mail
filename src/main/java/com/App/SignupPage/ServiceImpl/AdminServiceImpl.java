package com.App.SignupPage.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.App.SignupPage.Model.User;
import com.App.SignupPage.Repository.UserRepository;
import com.App.SignupPage.Service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	public UserRepository userRepository;
	
	@Override
	public List<User> listAllUsers() {
		return userRepository.findAll();
	}
}
