package automobile;

public class Automobiles {

	int speed;
	
	//Only in class
	private int privateSpeed;
	
	//Anywhere in Java world with importing the package and class
	public int publicSpeed;
	
	//In same package and in sub classes
	protected int protectedSpeed;
	
	
	int speedLimit = 100;
	
	public Automobiles () {
		this(0);
	}
	
	public void setPrivateSpeed( int pSpeed) {
		privateSpeed = pSpeed;
	}
	
	public Automobiles (int startSpeed) {
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
