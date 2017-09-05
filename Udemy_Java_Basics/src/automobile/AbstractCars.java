package automobile;

public abstract class AbstractCars {
	
	private int privateSpeed;
	public int publicSpeed;
	public int numOfCyl;
	
	protected int protectedSpeed;
	
	
	int speedLimit = 100;
	
	public AbstractCars () {
		this(0);
	}
	
	public AbstractCars (int startSpeed) {
		this.privateSpeed = startSpeed;
	}
	
	public void setPrivateSpeed( int pSpeed) {
		privateSpeed = pSpeed;
	}
	
	public abstract void engineStart(String keyTYpe, int numOfCyl);
	}

