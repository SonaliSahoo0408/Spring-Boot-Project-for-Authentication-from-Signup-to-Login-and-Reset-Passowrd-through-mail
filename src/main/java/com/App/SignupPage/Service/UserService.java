package com.App.SignupPage.Service;

import com.App.SignupPage.Model.User;

public interface UserService {
	public User registerUser(User user) throws Exception;
	public User getUserByEmail(String email);
	public User forgotPasswordThroughEmail(String email);
	public String resetPasswordByEmail(String email,String password);
	public String loginUser(String email,String password);
}