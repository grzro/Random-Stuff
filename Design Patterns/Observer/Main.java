public class Main {
	public static void main(String args[]) {
		Channel newCh = new Channel();
		User usr1 = new User("Tom");
		newCh.registerObserver(usr1);
		
		newCh.publishSth();
		
		User usr2 = new User("Peter");
		newCh.registerObserver(usr2);
		
		newCh.publishSth();
		
		User usr3 = new User("Jack");
		newCh.registerObserver(usr3);
		
		newCh.unregisterObserver(usr2);
		
		newCh.publishSth();
	}
}
