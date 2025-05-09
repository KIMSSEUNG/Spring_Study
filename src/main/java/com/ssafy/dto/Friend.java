package com.ssafy.dto;

import org.springframework.stereotype.Component;

//@Component
public class Friend {
	String name;
	int age;
	public Friend(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Friend() {
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
		return "Friend [name=" + name + ", age=" + age + "]";
	}
}
