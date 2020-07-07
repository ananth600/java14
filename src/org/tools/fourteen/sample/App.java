package org.tools.fourteen.sample;

import java.util.List;

public class App {

	
	public static void main(String args[]) {
		runInstanceOf(new Car());
		runInstanceOf(new Airplane());
		switchExpression("Sunday");
		createRecord();
		createNullPointer();
	}
	
	//Pattern matching for intanceof in Java 14
	public static void runInstanceOf(Vehicle vehicle) {
		if(vehicle instanceof Car car) {
			System.out.println("Driving Speed "+ car.drivingSpeed());
		} else if(vehicle instanceof Airplane plane) {
			System.out.println("Flying Speed "+ plane.flyingSpeed());
		}
	}
	//Switch with expression
	public static void switchExpression(String day) {
		switch(day.toLowerCase()) {
			case "saturday" -> { System.out.println("Hey it's saturday"); }
			case "sunday" -> { System.out.println("Sunday let's sleep more"); }
			default -> {
				if(day.isEmpty()) {
					System.out.println("Not sure what day !!");
				} else {
					System.out.println("Today is "+day);
				}
			}
		}
	}
	//Creating and using record
	public static void createRecord() {
		User user = new User("James","Smith");
		System.out.println("Full name :: "+user.fullName());
	}
	//Show code details null pointer  -XX:+ShowCodeDetailsInExceptionMessages
	public static void createNullPointer() {
		var list = createNullList();
		list.add("add to null list");
		
	}
	
	public static List<String> createNullList(){
		return null;
	}
	
}
