package ar.edu.unq.po2.tp3;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public Point() {
		this.setX(0);
		this.setY(0);
	}
	
	public void movePoint(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public void sumToOtherPoint(Point p) {
		this.setX(p.getX() + this.getX());
		this.setY(p.getY() + this.getY());
	}
	
	public int getX() {
		return x;
	}
	private void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	private void setY(int y) {
		this.y = y;
	}
	
}
