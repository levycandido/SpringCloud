package com.appsdevelopingblog.app.ws.io.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity(name="users")
public class UserEntity implements Serializable {

	private static final long serialVersionUID = -244712593981348519L;
	
	@Id
	@GeneratedValue
	private long id;
	@Column(nullable=false, length=50)
	private String userId;
	@Column(nullable=false, length=50)
	private String firstName;
	@Column(nullable=false, length=50)
	private String lastName;
	@Column(nullable=false, length=50)
	private String email;
	@Column(nullable=false, length=50)
	private String password;
	@Column(nullable=true)
	private String encryptedPassword;
	private String emailVerificationToken;
	@Column(nullable=false)
	private Boolean emailVerificationStatus = false;
	@OneToMany(mappedBy="userDetails", cascade = CascadeType.ALL)
	List<AddressEntity> address;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	public String getEmailVerificationToken() {
		return emailVerificationToken;
	}
	public void setEmailVerificationToken(String emailVerificationToken) {
		this.emailVerificationToken = emailVerificationToken;
	}
	public Boolean getEmailVerificationStatus() {
		return emailVerificationStatus;
	}
	public void setEmailVerificationStatus(Boolean emailVerificationStatus) {
		this.emailVerificationStatus = emailVerificationStatus;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<AddressEntity> getAddress() {
		return address;
	}
	public void setAddress(List<AddressEntity> address) {
		this.address = address;
	}
	
}
