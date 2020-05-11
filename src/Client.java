
public class Client {

	public static void main(String[] args) {

		VehicleShowRoom vehicleShowRoom = new VehicleShowRoom();

		Vehicle vehicle = new SportsVehicle();
		vehicle.setEnginePower(3000);
		vehicle.setModelNumber(101);
		vehicle.setTireSize(5);

		vehicleShowRoom.addVehicle(vehicle);
		vehicleShowRoom.showVehiclesWithDetails();
		vehicleShowRoom.showVehiclesWithVisitors();

	}

}
