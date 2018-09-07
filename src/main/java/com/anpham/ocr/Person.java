package com.anpham.ocr;

import java.util.Date;

public class Person {

	private String name;
	
	private int age;
	
	private Date date;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Date getDate() {
		return date;
	}

	public String toString() {
		return "Name: " + name + " Age: " + age + " Date: " + date;
	}
}

