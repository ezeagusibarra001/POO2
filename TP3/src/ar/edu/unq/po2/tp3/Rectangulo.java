package ar.edu.unq.po2.tp3;

public class Rectangulo {
	private Point o = new Point();
	protected int w;
	protected int h;

	public Rectangulo(Point p, int w, int h) {
		this.setO(p);
		this.w = w;
		this.h = h;
	}

	public Rectangulo(int w, int h) {
		this.w = w;
		this.h = h;
	}

	public int getArea() {
		return this.w * this.h;
	}

	public int getPerimetro() {
		return (this.w * 2) + (this.h * 2);
	}
	
	public boolean isHorizontal() {
		return this.w > this.h;
	}
	
	public boolean isVertical() {
		return !isHorizontal();
	}

	public Point getO() {
		return o;
	}

	private void setO(Point o) {
		this.o = o;
	}

}
