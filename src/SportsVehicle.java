public class SportsVehicle extends Vehicle {

	private final String vehicleType="Sports";
	private String turbo = "Turbo";
	
	public SportsVehicle() {
		super.setEngine(new OilEngine());
	}


	@Override
	void showDetails() {
		System.out.println("Model Number: "+super.getModelNumber());
		System.out.println("Vehicle Type: "+vehicleType);
		System.out.println("Features:");
		System.out.println(">> Engine Power: "+super.getEnginePower());
		System.out.println(">> Tire Size: "+super.getTireSize());
		System.out.println(">> Engine Type: "+super.getEngine().getEngineName());
		System.out.println(">> "+turbo+"\n");
		
	}
	
	





	

}
