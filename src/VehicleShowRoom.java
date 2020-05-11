import java.util.ArrayList;

public class VehicleShowRoom {

	private int expectedVisitor;
	private ArrayList<Vehicle> vehicles;

	public VehicleShowRoom() {
		expectedVisitor = 30;
		vehicles = new ArrayList<Vehicle>();
	}

	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
		if (vehicle instanceof SportsVehicle)
			expectedVisitor += 20;
	}

	public void removeVehicle(Vehicle vehicle) {
		vehicles.remove(vehicle);
		if (vehicle instanceof SportsVehicle)
			expectedVisitor += 20;

	}

	public int getExpectedVisitor() {
		return expectedVisitor;
	}

	public void setExpectedVisitor(int expectedVisitor) {
		this.expectedVisitor = expectedVisitor;
	}

	public void showVehiclesWithDetails() {
		System.out.println("List of vehicles with details");
		System.out.println("------------------------------");
		for (Vehicle vehicle : vehicles) {
			vehicle.showDetails();
		}
	}

	public void showVehiclesWithVisitors() {
		System.out.println("Current Expected visitor: " + getExpectedVisitor());
		System.out.println("List of vehicles:");
		System.out.println("-------------------------------");
		for (Vehicle vehicle : vehicles) {
			System.out.println("Model Number: " + vehicle.getModelNumber());
			
		}
	}

}
