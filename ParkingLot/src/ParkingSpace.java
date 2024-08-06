
public class ParkingSpace {

	int spaceNum; //number for parking space ie: A7. num = 7
	char floor; //holds the character associated with the floor ie: A7. floor = A
	boolean isCompact; // is the car compact?
	boolean isOccupied; //whether the space has a parked car
	
	
	public ParkingSpace(int spaceNum, char floor, boolean isCompact) {
		this.spaceNum =spaceNum;
		this.floor = floor;
		this.isCompact = isCompact;
		isOccupied = false;
	}

	public int getSpaceNum() {
		return spaceNum;
	}
	
	public char getFloor() {
		return floor;
	}

	public boolean getCompact() {
		return isCompact;
	}	
			
	public boolean getOccupied() {
		return isOccupied;
	}

	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}

	public String toString() {
		String s ="";
		
		s+= getFloor();
		s += getSpaceNum();
		s += " (";
		
		if (getCompact()) {
			s += "C";
		} else {
			s += "N";
		}
		
		if (getOccupied()) {
			s += " X)";
		} else {
			s += " O)";
		}
		
		return s;
	}


	// Using %
	// Using integer /
	

}
