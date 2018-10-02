package com.linkit.team_rostering;

import java.time.LocalDateTime;
import java.time.LocalDate;

public class DayOffRequest implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private com.linkit.team_rostering.Employee employee;
	private java.time.LocalDateTime date;

	private java.lang.Integer weight;

	public DayOffRequest() {
	}

	public com.linkit.team_rostering.Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(com.linkit.team_rostering.Employee employee) {
		this.employee = employee;
	}

	public java.time.LocalDateTime getDate() {
		return this.date;
	}

	public void setDate(java.time.LocalDateTime date) {
		this.date = date;
	}

	public java.lang.Integer getWeight() {
		return this.weight;
	}

	public void setWeight(java.lang.Integer weight) {
		this.weight = weight;
	}

	public DayOffRequest(com.linkit.team_rostering.Employee employee,
			java.time.LocalDateTime date, java.lang.Integer weight) {
		this.employee = employee;
		this.date = date;
		this.weight = weight;
	}

}