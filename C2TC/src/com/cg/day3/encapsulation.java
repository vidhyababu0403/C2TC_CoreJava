package com.cg.day3;

public class encapsulation {
	private int id;
	private int age;
	private String name;
	private String email;
	public encapsulation() {
		super();
	}
	public encapsulation(int id, int age, String name, String email) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "encapsulation [id=" + id + ", age=" + age + ", name=" + name + ", email=" + email + "]";
	}
	
	
	}

