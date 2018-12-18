public class Car {

	Tires tire;
	Engine engine;
	
	public Engine getEngine() {
		return engine;
	}
	
	public Tires getTire() {
		return tire;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void setTire(Tires tire) {
		this.tire = tire;
	}
	
	@Override
	public String toString() {
		return "Car [tires=" + tire + ", engine=" + engine + "]";
	}
}
