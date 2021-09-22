package SGDO;

import java.util.logging.Logger;


public class GarageDoorAdapter implements StdGarageDoorOpener {

	private Logger log = Logger.getLogger(
    		GarageDoorApp.class.getSimpleName());
	
	GarageDoorDriver boo = new GarageDoorDriver();
	
	public void openDoor() {
		boo.openDoor(3);
	}
	
	
	public void closeDoor() {
		boo.closeDoor(2);	
	}
	 	
}
