
public class Rectangle {
	private int length;
	private int width;
	private int area;
	private int perimeter;
	
	public Rectangle(int length, int width, int area, int perimeter){
		this.length = length;
		this.width = width;
		this.area = area;
		this.perimeter = perimeter;
	}
	
	public int getLength() {
		return this.length;
	}
	public int getWidth() {
		return this.width;
	}
	public int getArea() {
		return this.area;
	}
	public int getPerimeter() {
		return this.perimeter;
	}
	
	public void setLength(int newLength) {
		this.length = newLength;
	}
	public void setWidth(int newWidth) {
		this.width= newWidth;
	}
	public void setArea(int newArea) {
		this.area = newArea;
	}
	public void setPerimeter(int newPerimeter) {
		this.perimeter = newPerimeter;
	}
	public int area() {
		length * width = area;
}
	public int compareArea() {
		Object other;
		if(this.area < other.area) {
			return this.area;
		}
	//public boolean square() {
		
	//}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
