package com.cg.fms.dto;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity(name = "User")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private BigInteger userId;
	
	@Column(name = "user_name")
	@NotEmpty(message = "User Name is Empty")
	@Size(min = 2, max = 40, message = "Name must be between 2 and 40 characters ")
	private String userName;
	
	@Column(name = "user_password")
	@NotEmpty(message = "Password is Empty")
	@Size(min = 2, max = 15, message = "Password must be between 2 and 15 characters ")
	private String userPassword;
	
	@Column(name = "user_phone")
	private String userPhone;
	
	@Column(name = "user_email")
	@NotEmpty(message = "Please Enter Email Address")
	@Email(message = "Enter Valid Email Address ")
	private String email;
	
	@Column(name = "user_type")
	private String userType;
	@Column
	private boolean active;

	public User() {
		super();
	}

	public BigInteger getUserId() {
		return userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	
	
	public User(BigInteger userId, String userName, String userPassword, String userPhone, String email, String userType,
			boolean active) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.email = email;
		this.userType = userType;
		this.active = active;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPhone=" + userPhone + ", email=" + email
				+ ", userType=" + userType + "]";
	}

}