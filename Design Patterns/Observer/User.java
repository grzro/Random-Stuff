public class User implements Observer {

	public String name;
	public int sthToWatch;
	
	public User(String name) {
		this.name = name;
		this.sthToWatch = 0;
	}
	
	@Override
	public void update() {
		sthToWatch++;
		System.out.println("hey " + name + ", you have " + sthToWatch + " notif.");
	}

}
