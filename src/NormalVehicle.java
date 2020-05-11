
public class NormalVehicle extends Vehicle {

	private final String vehicleType="Normal";
	
	public NormalVehicle() {
		super.setEngine(new GasEngine());
	}
	
	public NormalVehicle(Engine engine) {
		super.setEngine(engine);
	}
	
	
	@Override
	void showDetails() {
		System.out.println("Model Number: "+super.getModelNumber());
		System.out.println("Vehicle Type: "+vehicleType);
		System.out.println("Features:");
		System.out.println(">> Engine Power: "+super.getEnginePower());
		System.out.println(">> Tire Size: "+super.getTireSize());
		System.out.println(">> Engine Type: "+super.getEngine().getEngineName()+"\n");
		
	}
	
	
	

	
	
}
