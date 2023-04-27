package jp.co.aforce.text;

public class Main {
	public static void main(String[] args) {
		
		Car car1 = new Car();
		Key key = new Key();
		car1.lock(key);
		
		Car car2 = new Car();
		RemoteController controller = new RemoteController();
		car2.lock(controller);
	}

}
