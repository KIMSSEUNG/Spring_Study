package com.ssafy.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


public class Member {
	String name;
	int age;
	@Autowired
	Friend f;
	
	public Friend getFriend() {
		return f;
	}
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Member() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
