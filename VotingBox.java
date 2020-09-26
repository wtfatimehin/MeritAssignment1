import stanford.karel.*;

public class VotingBox extends SuperKarel {

	public void run() {
		
		while (frontIsClear()) {
			move();
			if (noBeepersPresent()) {
				takeOutChad();
			}
			move();
		}
	}
	
	//This removes the chad from the whole ballet
	private void takeOutChad() {
		turnRight();
		checkCornersForPunch();
		turnLeft();	
	}
	
	
	private void checkCornersForPunch( ) {
		lookAtCorner();
		lookAtCorner();
	}
	
	//This checks the top and bottom spots for beepers then
	//Picks beeper up then turns Karel around
	private void lookAtCorner() {
		move();
		while (beepersPresent()) {
			pickBeeper();
		}
		turnAround();
		move();
		
	}
		
}
