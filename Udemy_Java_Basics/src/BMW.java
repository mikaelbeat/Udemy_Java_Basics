
public class BMW extends Karz {
	public BMW(int startSpeed) {
		super(startSpeed);
	}

	@Override
	public void increaseSpeed() {

		System.out.println("Increasing speed of the BMW");
	}

	public void headupDisplayNavigation() {
		System.out.println("BMW specific functionality");
	}
	
	}

