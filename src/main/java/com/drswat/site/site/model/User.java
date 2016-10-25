package com.drswat.site.site.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "user")
public class User {
	@Column(unique = true, nullable = false, length = 64)
	@NotBlank(message = "error.email")
	@Email(message = "error.email")
	private String email;

	@Id
	@GeneratedValue
	private Integer id;

	private String phone;

	@OneToMany(mappedBy = "owner")
	private List<Property> properties;
	@Column(unique = true, nullable = false)
	@Length(min = 1, max = 20, message = "error.username")
	private String username;

	public String getEmail() {
		return email;
	}

	public Integer getId() {
		return id;
	}

	public String getPhone() {
		return phone;
	}

	public List<Property> getProperties() {
		return properties;
	}

	public String getUsername() {
		return username;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}