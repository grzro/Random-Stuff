public class FasterCar implements CarBuilder{
	private Car car;
	
	public FasterCar() {
		this.car = new Car();
	}
	
	@Override
	public void buildTires() {
		Tires tire = new Tires();
		tire.setDurability(20);
		tire.setTireType("slick");
		this.car.setTire(tire);
	}
	
	@Override
	public void buildEngine() {
		Engine eng = new Engine();
		eng.setType("V8");
		this.car.setEngine(eng);
	}
	
	@Override
	public Car getCar() {
		return this.car;
	}
}
