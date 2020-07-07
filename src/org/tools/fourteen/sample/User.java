package org.tools.fourteen.sample;

public record User(String firstName,String lastName) {
	
	public String fullName() {
		return firstName + " " + lastName;
	}

}
