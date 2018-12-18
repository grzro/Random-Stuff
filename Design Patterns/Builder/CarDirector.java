public class CarDirector {

	private CarBuilder carBuilder;

	public CarDirector(CarBuilder cB) {
		this.carBuilder = cB;
	}

	public void makeCar() {
		carBuilder.buildEngine();
		carBuilder.buildTires();
	}

	public Car getCar() {
		return this.carBuilder.getCar();
	}
}
