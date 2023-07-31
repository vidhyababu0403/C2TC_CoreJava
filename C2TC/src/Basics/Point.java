package Basics;

public class Point {
	private float x;
	private float y;
	Point(){
		x=1.0f;
		y=2.0f;
	}
	
	public Point(float x) {
		super();
		this.x = x;
		this.y = x;
	}
	public Point(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
    

	

}
