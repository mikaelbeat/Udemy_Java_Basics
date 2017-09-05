
public class Karz {

	int speed;
	
	public Karz (int startSpeed) {
		speed = startSpeed;
	}
	
	public void increaseSpeed() {
		speed++;
		System.out.println("Increasing speed of automobiles");
	}
	
	public void decreaseSpeed() {
		speed--;
		System.out.println("Decrease speed of automobiles");
	}
}
