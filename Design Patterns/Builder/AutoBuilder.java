public class AutoBuilder implements CarBuilder {

	private Car car;

	public AutoBuilder() {
		this.car = new Car();
	}

	@Override
	public void buildEngine() {
		Engine eng = new Engine();
		eng.setType("R5");
		car.setEngine(eng);
	}

	@Override
	public void buildTires() {
		Tires tire = new Tires();
		tire.setDurability(12);
		tire.setTireType("winter");
		car.setTire(tire);
	}

	@Override
	public Car getCar() {
		return this.car;
	}
}
