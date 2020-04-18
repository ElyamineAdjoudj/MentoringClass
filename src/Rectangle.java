
public class Rectangle {
	
	private double length;
	private double width;
	
	public void setLength(double l) {
		length=l;
		System.out.println("You have set the length to "+ length);
		
	}
	public void setWidth(double w) {
		width=w;
		System.out.println("You have set the width to "+ width);
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public double getArea() {
		
		return length*width;
	}
	
	

}
