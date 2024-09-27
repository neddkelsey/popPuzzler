package com.popPuzzler.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table
public class Member implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;  
	
	@Column
	private String username;
	
	@Column
	private String password;
	
	public Member() {
		super();
	}
	public Member(Integer id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	public Member(Integer id, String username) {
		super();
		this.id = id;
		this.username = username;
	}
	
	public Member(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
