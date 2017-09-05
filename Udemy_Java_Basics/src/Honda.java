import automobile.*;

public class Honda extends Automobiles{

		public void increaseHondaSpeed() {
			Automobiles c1 = new Automobiles();
			c1.publicSpeed = 10;
			c1.setPrivateSpeed(10);
			protectedSpeed = 100;
		}
}
