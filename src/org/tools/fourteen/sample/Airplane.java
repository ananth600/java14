package org.tools.fourteen.sample;

public class Airplane extends Vehicle {

	@Override
	public String getVehicleType() {
		return "Plane";
	}
	
	public String flyingSpeed() {
		return "300mph";
	}

}
