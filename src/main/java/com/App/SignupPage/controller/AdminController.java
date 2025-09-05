package com.App.SignupPage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.App.SignupPage.Model.User;
import com.App.SignupPage.Service.AdminService;


@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService aService;
	
	@GetMapping("/allUserDetails")
	public ResponseEntity<List<User>> getAllEmployees() {
		List<User> listUsers = aService.listAllUsers();
		if(!listUsers.isEmpty())
			return new ResponseEntity<>(listUsers,HttpStatus.OK);
		return new ResponseEntity<>(listUsers,HttpStatus.NO_CONTENT);
	}
}
