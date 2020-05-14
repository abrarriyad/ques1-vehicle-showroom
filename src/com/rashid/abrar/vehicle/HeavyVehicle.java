package com.rashid.abrar.vehicle;

import com.rashid.abrar.engine.DieselEngine;

public class HeavyVehicle extends Vehicle {

	private final String vehicleType = "Heavy";
	private final int weight = 100;

	public HeavyVehicle() {
		super.setEngine(new DieselEngine());

	}

	@Override
	void showDetails() {
		System.out.println("Model Number: " + super.getModelNumber());
		System.out.println("Vehicle Type: " + vehicleType);
		System.out.println("Features:");
		System.out.println(">> Engine Power: " + super.getEnginePower());
		System.out.println(">> Tire Size: " + super.getTireSize());
		System.out.println(">> Engine Type: " + super.getEngine().getEngineName());
		System.out.println("Weight: " + weight + "\n");

	}

}
