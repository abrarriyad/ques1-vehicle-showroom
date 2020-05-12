package com.rashid.abrar.client;
import java.util.Scanner;

import com.rashid.abrar.engine.GasEngine;
import com.rashid.abrar.vehicle.HeavyVehicle;
import com.rashid.abrar.vehicle.NormalVehicle;
import com.rashid.abrar.vehicle.OilEngine;
import com.rashid.abrar.vehicle.SportsVehicle;
import com.rashid.abrar.vehicle.Vehicle;
import com.rashid.abrar.vehicle.VehicleShowRoom;


public class Client {

	public static void main(String[] args) {

		VehicleShowRoom vehicleShowRoom = new VehicleShowRoom();

		Vehicle sportsVehicle1 = new SportsVehicle();
		sportsVehicle1.setEnginePower(3000);
		sportsVehicle1.setModelNumber("Porsche 911");
		sportsVehicle1.setTireSize(50);
			
		Vehicle sportsVehicle2 = new SportsVehicle();	
		sportsVehicle2.setEnginePower(3000);
		sportsVehicle2.setModelNumber("Mazda MX-5");
		sportsVehicle2.setTireSize(60);
		
		Vehicle heavyVehicle1 = new HeavyVehicle();
		heavyVehicle1.setEnginePower(4000);
		heavyVehicle1.setModelNumber("Nissan NV1500 Cargo");
		heavyVehicle1.setTireSize(80);
		
		Vehicle heavyVehicle2 = new HeavyVehicle();
		heavyVehicle2.setEnginePower(5000);
		heavyVehicle2.setModelNumber("Toyota Land Cruiser");
		heavyVehicle2.setTireSize(85);
		
		Vehicle normalVehicle1 = new NormalVehicle();
		normalVehicle1.setModelNumber("Maruti Baleno");
		normalVehicle1.setEnginePower(1500);
		normalVehicle1.setTireSize(40);
		
		Vehicle normalVehicle2 = new NormalVehicle(new OilEngine());
		normalVehicle2.setModelNumber("Hyundai Creta");
		normalVehicle2.setEnginePower(1800);
		normalVehicle2.setTireSize(35);
	
		vehicleShowRoom.addVehicle(normalVehicle1);
		vehicleShowRoom.addVehicle(normalVehicle2);
		vehicleShowRoom.addVehicle(heavyVehicle1);
		vehicleShowRoom.addVehicle(heavyVehicle2);
		vehicleShowRoom.addVehicle(sportsVehicle1);
		vehicleShowRoom.addVehicle(sportsVehicle2);
		
		vehicleShowRoom.removeVehicle(sportsVehicle1);
		vehicleShowRoom.removeVehicle(heavyVehicle2);
		
		vehicleShowRoom.addVehicle(sportsVehicle1);

		vehicleShowRoom.showVehiclesWithVisitors();
		vehicleShowRoom.showVehiclesWithDetails();
		

	}

}
