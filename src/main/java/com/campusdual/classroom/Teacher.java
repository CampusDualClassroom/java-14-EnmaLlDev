package com.campusdual.classroom;

public class Teacher extends Person {

	protected String area;

	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}
	@Override
	public void getDetails() {
		super.getDetails();
		StringBuilder newDetails = new StringBuilder();
		newDetails.append("Area: "+area);
		System.out.println(newDetails);
	}
}
