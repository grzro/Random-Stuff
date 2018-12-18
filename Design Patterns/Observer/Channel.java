import java.util.ArrayList;

public class Channel implements ObsActions{
	
	ArrayList <Observer> users;
	
	public Channel() {
		users = new ArrayList<Observer>();
	}

	public void publishSth() {
		System.out.println("Publishing something");
		notifyObservers();
	}
	
	@Override
	public void registerObserver(Observer o) {
		users.add(o);		
	}

	@Override
	public void unregisterObserver(Observer o) {
		users.remove(o);		
	}

	@Override
	public void notifyObservers() {
		for(Observer x : users) {
			x.update();
		}
		
	}

}
