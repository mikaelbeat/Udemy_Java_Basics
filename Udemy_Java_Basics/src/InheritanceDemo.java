
import automobile.BMW;
import automobile.Automobiles;

public class InheritanceDemo {

	public static void main(String[] args) {
		int speed = 0;

		Automobiles c1 = new Automobiles(speed);
		c1.increaseSpeed();
		c1.publicSpeed = 10;
		
		BMW bmw1 = new BMW(speed);
		bmw1.increaseSpeed();
		bmw1.headupDisplayNavigation();
		
	}

}
