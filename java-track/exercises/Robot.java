import encapsulation.Computer;

public class Robot {
	final public static int NORTH = 0;
	final public static int SOUTH = 1;
	final public static int EAST = 2;
	final public static int WEST = 3;
	
	private String name;
	private int speed;
	private int xPosition;
	private int yPosition;
	private int orientation;

	public Robot(String name, int xposition, int yposition, int speed, int orientation) {
		this.name = name;
		this.xPosition = xposition;
		this.yPosition = yposition;
		this.speed = speed;
		this.orientation = orientation;

	}

	public Robot(String name, int speed, int orientation) {
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
	public void setxPosition(xPosition) {
		this.xPosition = XPosition;
	}
	public void setyPosition(YPosition) {
		this.yPosition = YPosition;
	}

	public int getSpeed() {
		return this.speed;
	}

	public int getOrientation() {
		return this.orientation;
	}

	public void move() {
		if (this.orientation == Robot.NORTH) {
			this.yPosition.setY(this.yPosition.getY() + this.speed);
		} else if (this.orientation == Robot.EAST) {
			this.xPosition.setX(this.xPosition.getX() + this.speed);
		} else if (this.orientation == Robot.WEST) {
			this.xPosition.setX(this.xPosition.getX() - this.speed);
		} else if (this.orientation == Robot.SOUTH) {
			this.yPosition.setY(this.yPosition.getY() - this.speed);
		}

	}

	public void rotate() {
		if (this.orientation == Robot.NORTH) {
			this.orientation = Robot.EAST;
		} else if (this.orientation == Robot.EAST) {
			this.orientation = Robot.SOUTH;
		} else if (this.orientation == Robot.SOUTH) {
			this.orientation = Robot.WEST;
		} else if (this.orientation == Robot.WEST) {
			this.orientation = Robot.NORTH;
		}
	}

	public double calculateDistance(Robot otherRobot) {
		int x1 = this.xPosition.getX();
		int y1 = this.yPosition.getY();
		int x2 = otherRobot.getXPosition().getX();
		int y2 = otherRobot.getYPosition().getY();
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}

	public String toString() {
		String ori = "";
		if(this.orientation == Robot.NORTH) {
			ori = "North";
		}
		else if(this.orientation == Robot.SOUTH) {
			ori = "South";
		}
		else if(this.orientation == Robot.EAST) {
			ori = "East";
			
		}
		else if(this.orientation == Robot.WEST) {
			ori = "West";
		}
		return this.name + " " + this.xPosition + " " + this.yPosition + " " + this.speed + " " + ori;
	}

	public static void main(String[] args) {
		Robot myRobot = new Robot("jimmy", 2, Robot.NORTH);
		myRobot.setXPosition(myRobot.new int (0));
		myRobot.setYPosition(myRobot.new int (0));
		System.out.println(myRobot.getName());
		Robot yourRobot = new Robot("candy", 3, Robot.SOUTH);
		yourRobot.setXPosition(yourRobot.new  xPosition(0));
		yourRobot.setYPosition(yourRobot.new  yPosition(4));
		System.out.println(yourRobot.getName());
		System.out.println(myRobot.getPosition());
		System.out.println(myRobot.getSpeed());
		System.out.println(yourRobot.getPosition());
		System.out.println(yourRobot.getSpeed());
		System.out.println(myRobot);
		System.out.println(myRobot.calculateDistance(yourRobot));
		myRobot.move();
		System.out.println(myRobot);
		myRobot.rotate();
		System.out.println(myRobot);
	}

	public class Point {
		private int x;
		private int y;

		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public String toString() {
			return "(" + this.x + ", " + this.y + ")";
		}
	}
}