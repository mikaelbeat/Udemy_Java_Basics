package automobile;

public class BMW extends Automobiles {
	public BMW(int startSpeed) {
		super(startSpeed);
	}

	@Override
	public void increaseSpeed() {
		protectedSpeed++;
		Automobiles c1 = new Automobiles();
		c1.decreaseSpeed();

		System.out.println("Increasing speed of the BMW");
	}

	public void headupDisplayNavigation() {
		System.out.println("BMW specific functionality");
	}
	
	}

