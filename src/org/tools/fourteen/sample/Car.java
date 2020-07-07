package org.tools.fourteen.sample;

public class Car  extends Vehicle {
	
	@Override
	public String getVehicleType() {
		return "Car";
	}
	public String drivingSpeed() {
		return "100mph";
	}

}
