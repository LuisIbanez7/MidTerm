//import stanford.karel.SuperKarel;
import stanford.karel.*;

public class Problem1 extends SuperKarel {

	public void run() {
		moveUpRow();
		for (int i = 0; i < 4; i++) {
			handleBorder();
			nextPosition();
		}
	}

	private void handleBorder() {
		move();
		int numOfBeepers = getBeepersInBag();
		if(numOfBeepers < 100) {
			setBeepersInBag(100);
		}
		while (frontIsClear()) {
			if (noBeepersPresent()) {
				putBeeper();
			}
			move();
		}
	}

	private void moveUpRow() {
		turnLeft();
		move();
		turnRight();
	}

	private void nextPosition() {
		turnRight();
		move();
		turnRight();
		move();
		turnRight();
	}

}
