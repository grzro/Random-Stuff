public class Main {
	public static void main(String args[]) {
		CarBuilder carBuilder = new AutoBuilder();
		CarDirector carDir = new CarDirector(carBuilder);
		carDir.makeCar();
		
		Car car = carDir.getCar();
		System.out.println(car);
		
		carBuilder = new FasterCar();
		carDir = new CarDirector(carBuilder);
		carDir.makeCar();
		
		car = carDir.getCar();
		System.out.println(car);
	}
}
