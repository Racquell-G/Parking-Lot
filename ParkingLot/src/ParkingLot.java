
public class ParkingLot {

	ParkingSpace [] parkingLot; // array of ParkingSpace objects. holds info for all parking spaces
	int numSpaces; //holds number of spaces on each floor
	int numFloors; //holds total number of floors in lot
	
	public ParkingLot(int ns, int nf) { //numberOfSpaces, numberOfFloors
		this.numSpaces = ns;
		this.numFloors = nf;
		
		parkingLot = new ParkingSpace [numSpaces * numFloors];  //number of spaces
		
		int currentSpace = 0;
		boolean compact;
		for (int y = 0; y < numFloors; y++) {
			for (int x = 0; x < numSpaces; x++) {
				
				if (x < 4) {
					compact = true;
				} else {
					compact = false;
				}
				
				parkingLot [currentSpace] = new ParkingSpace(x, (char) (65 + y),  compact);
				
				currentSpace++;
			}
		}	
	}
	
	public static void main(String [] args) {
	
	}	
	
	ParkingSpace enterLot (boolean compactCar) {
		//loop through parkinglot array
		if (compactCar) { //parking for compact car
		for (int i = 0; i < parkingLot.length; i++) {
			if (!parkingLot [i].getOccupied());
			//Found available space
				//No longer available
					parkingLot[i].setOccupied(true);
				//Return parking spot
					return parkingLot [i];
			}
		} else  { //parking for a non compact car
			for (int i = 0; i < parkingLot.length; i++) {
				if (!parkingLot [i].getOccupied() && !parkingLot [i].getCompact()) { //not occupied and not compact
					//Found available space
						//No longer available
							parkingLot [i].setOccupied(true);
						//Return parking spot
							return parkingLot[i];	
			}
		}	
	}
		return null;
}
	void leaveLot (ParkingSpace ps) {
		for (int i = 0; i < numSpaces; i++) {
			if (ps.getFloor() == parkingLot [i].getFloor() && ps.getSpaceNum() == parkingLot[i].getSpaceNum()) {
				parkingLot[i].setOccupied(false);
				break;
			}
		}
	}
}
