package com.campusdual.classroom;

public class PoliceOfficer extends Person {

	protected String squad;

	public PoliceOfficer(String name, String surname, String squad) {
		super(name, surname);
		this.squad = squad;
	}
	@Override
	public void getDetails() {
		super.getDetails();
		StringBuilder newDetails = new StringBuilder();
		newDetails.append("Squad: "+ squad);
		System.out.println(newDetails);
	}
}
