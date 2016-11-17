import encapsulation.Computer;

public class Robot {
	//final public static int NORTH = 0;
	//final public static int SOUTH = 1;
	//final public static int EAST = 2;
	//final public static int WEST = 3;
	
	private String name;
	private int speed;
	private int xPosition;
	private int yPosition;
	private String orientation;

	public Robot(String name, int xposition, int yposition, int speed, String orientation) {
		this.name = name;
		this.xPosition = xposition;
		this.yPosition = yposition;
		this.speed = speed;
		this.orientation = orientation;

	}

	public Robot(String name, int speed, String orientation) {
		this.name = name;
		this.speed = speed;
		this.orientation = orientation;
	}

	public String getName() {
		return this.name;
	}

	public int getXPosition() {
		return this.xPosition;
	}
	public int getYPosition() {
		return this.yPosition; 
	}
	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}
	public void setyPosition(int YPosition) {
		this.yPosition = YPosition;
	}

	public int getSpeed() {
		return this.speed;
	}

	public String getOrientation() {
		return this.orientation;
	}

	public void move() {
		if (this.orientation == "NORTH") {
			setyPosition(getYPosition() + this.speed);
		} else if (this.orientation == "EAST") {
			setxPosition(getXPosition() + this.speed);
		} else if (this.orientation == "WEST") {
			setxPosition(getXPosition() - this.speed);
		} else if (this.orientation == "SOUTH") {
			setyPosition(getYPosition() - this.speed);
		}

	}

	public void rotate( String direction) {
		
		if(direction == "RIGHT"){
			if (this.orientation == "NORTH") {
				this.orientation = "EAST";
			} else if (this.orientation == "EAST") {
				this.orientation = "SOUTH";
			} else if (this.orientation =="SOUTH") {
				this.orientation = "WEST";
			} else if (this.orientation == "WEST") {
				this.orientation = "NORTH";
			}
		}else if(direction == "LEFT"){
			if (this.orientation == "NORTH") {
				this.orientation = "WEST";
			} else if (this.orientation == "EAST") {
				this.orientation = "NORTH";
			} else if (this.orientation =="SOUTH") {
				this.orientation = "EAST";
			} else if (this.orientation == "WEST") {
				this.orientation = "SOUTH";
			}
			
		}
		
		
	}

	public double calculateDistance(Robot otherRobot) {
		int x1 = this.xPosition;
		int y1 = this.yPosition;
		int x2 = otherRobot.getXPosition();
		int y2 = otherRobot.getYPosition();
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}

	public String toString() {
		
		return this.name + " " + this.xPosition + " " + this.yPosition + " " + this.speed + " " + this.orientation;
	}

	public static void main(String[] args) {
		Robot myRobot = new Robot("jimmy", 2, "NORTH");
		myRobot.setxPosition(0);
		myRobot.setyPosition(0);
		System.out.println(myRobot.getName());
		Robot yourRobot = new Robot("candy", 3, "SOUTH");
		yourRobot.setxPosition(0);
		yourRobot.setyPosition(4);
		System.out.println(yourRobot.toString());
		System.out.println(myRobot.toString());
		
		System.out.println(myRobot.calculateDistance(yourRobot));
		myRobot.move();
		System.out.println(myRobot);
		myRobot.rotate("LEFT");
		System.out.println(myRobot);
	}

	
}