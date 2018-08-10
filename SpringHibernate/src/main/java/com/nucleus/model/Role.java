package com.nucleus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Role153")
public class Role {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="Role")
	private String role;
	@Column(name="Description")
	private String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Role(){
		
	}
	public Role(int id, String role, String description) {
		super();
		this.id = id;
		this.role = role;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", role=" + role + ", description="
				+ description + "]";
	}
	
}
