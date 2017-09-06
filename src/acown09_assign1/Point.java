package acown09_assign1;

/**
 * Created by: Admir Cosic, 2017-08-29
 * Last changed by: Admir Cosic, 2017-08-31
 *
 * Exercise 10: Point
 */

public class Point {

	private int _x;
	private int _y;
	
	public Point(){
		_x = 0;
		_y = 0;
	}
	
	public Point (int x, int y) {
		_x = x;
		_y = y;
	}
	
	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point(3,4);
				
		System.out.println(p1.toString());   // ==> (0,0)
		System.out.println(p2.toString());   // ==> (3,4)
				
		if (p1.isEqualTo(p2)) {
			System.out.println("The two points are equal");
		}
				
		double dist = p1.distanceTo(p2);
		System.out.println("Point Distance: "+dist);
		
		
				
		p2.move(5,-2);         // ==> (8,2)
		p1.moveToXY(8,2);      // ==> (8,2)		
		
		if (p1.isEqualTo(p2)) {
			System.out.println("The two points are equal");
		}

	}
	
	public int getX() {
		return _x;
	}
	
	public int getY() {
		return _y;
	}
	
	public void setX(int x) {
		_x = x;
	}
	
	public void setY(int y) {
		_y = y;
	}
	
	public void move(int x, int y) {
		setX(getX() + x);
		setY(getY() + y);
	}
	
	public void moveToXY(int x, int y){
		setX(x);
		setY(y);
	}
	
	public boolean isEqualTo(Point point) {
		return point.getX() == getX() && point.getY() == getY();
	}
	
	public double distanceTo(Point point) {
		return Math.sqrt((getX() - point.getX()) * (getX() - point.getX())  + (getY() - point.getY()) * (getY() - point.getY()));
	}
	
	public String toString() {
		return "(" + getX() + ", " + getY() + ")";
	}
}