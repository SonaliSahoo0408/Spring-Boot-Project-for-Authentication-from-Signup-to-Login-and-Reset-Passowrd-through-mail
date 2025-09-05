package com.App.SignupPage.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name= " users")
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Username is required")
	@Size(min = 2, max = 50, message = " Username must be between 20 and 50 characters")
    private String username;
	
	@NotBlank(message=" Email is required")
    @Email(message = "Email should be valid")
    @Column(unique = true)
    private String email;
    
	@NotBlank(message = "Password is required")
	@Pattern(
			regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!#%?&])[A-Za-z\\d@$!%*?&]{8,}$", // check this 
			message= " Password must be at least 8 characters and include uppercase, lowercase, number")
	private String password;

	
	
    
}
