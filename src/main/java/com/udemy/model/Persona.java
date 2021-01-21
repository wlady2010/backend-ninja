package com.udemy.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Persona {

	@NotNull
	@Size(min = 2, max = 6)
	private String name;

	@NotNull
	@Min(18)
	private int age;

	public Persona() {

	}

	public Persona(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
		return "Persona [name=" + name + ", age=" + age + "]";
	}

}
