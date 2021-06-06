package com.validation.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	@NotNull
	private Integer id;
	@NotEmpty
	@Size(min = 2, message = "name must be minimum 2 charactor")
	private String name;
	
	@NotEmpty
	@Size(max=12, message = "name must be minimum 2 charactor")
	private String mobile;
	@NotEmpty
	@Email
	private String email;
	
	@NotEmpty
	@Size(min=3, message = "name must be minimum 2 charactor")
	private String city;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
