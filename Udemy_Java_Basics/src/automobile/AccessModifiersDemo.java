package automobile;

public class AccessModifiersDemo {

	public static void main(String[] args) {
		Automobiles c1 = new Automobiles();
		c1.increaseSpeed();
		c1.speed = 10;
		c1.setPrivateSpeed(10);
		c1.publicSpeed = 100;
		c1.protectedSpeed = 100;
		c1.decreaseSpeed();
	}

}
