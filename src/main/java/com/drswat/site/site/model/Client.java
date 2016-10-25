package com.drswat.site.site.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {
	@Id
	@GeneratedValue
	private Integer id;

	private String lastname;

	@OneToMany(mappedBy = "client")
	private List<Meeting> meetingDays;

	private String name;

	private String phone;
	private String surname;

	public Integer getId() {
		return id;
	}

	public String getLastname() {
		return lastname;
	}

	public List<Meeting> getMeetingDays() {
		return meetingDays;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getSurname() {
		return surname;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setMeetingDays(List<Meeting> meetingDays) {
		this.meetingDays = meetingDays;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}