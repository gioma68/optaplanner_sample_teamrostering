package com.linkit.trostering;

import java.time.LocalDateTime;
import java.time.LocalDate;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.linkit.common.AbstractPersistable;

@com.thoughtworks.xstream.annotations.XStreamAlias("GiorniFerie")
public class DayOffRequest extends AbstractPersistable {

	private com.linkit.trostering.Employee employee;
	private java.time.LocalDateTime date;

	private java.lang.Integer weight;

	public DayOffRequest() {
	}

	public com.linkit.trostering.Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(com.linkit.trostering.Employee employee) {
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

	public DayOffRequest(com.linkit.trostering.Employee employee,
			java.time.LocalDateTime date, java.lang.Integer weight) {
		this.employee = employee;
		this.date = date;
		this.weight = weight;
	}

}