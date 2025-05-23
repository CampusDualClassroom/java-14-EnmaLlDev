package com.campusdual.classroom;

public class Person {
	protected String name;
	protected String surname;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	public void getDetails() {
		StringBuilder details = new StringBuilder();
		details.append("Name: "+name).append(", Surname: "+surname);
		System.out.println(details);
	}
}
