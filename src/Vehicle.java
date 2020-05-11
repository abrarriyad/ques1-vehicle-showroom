
abstract public class Vehicle {
	
	private int modelNumber;
	private int enginePower;
	private int tireSize;
	private Engine engine;

	abstract void showDetails();

	public int getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	public int getEnginePower() {
		return enginePower;
	}
	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}
	public int getTireSize() {
		return tireSize;
	}
	public void setTireSize(int tireSize) {
		this.tireSize = tireSize;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engineType) {
		this.engine = engineType;
	}


	
	

}
