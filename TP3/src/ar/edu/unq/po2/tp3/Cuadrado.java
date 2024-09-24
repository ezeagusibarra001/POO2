package ar.edu.unq.po2.tp3;

public class Cuadrado extends Rectangulo {
	public Cuadrado(int w) {
		super(w, w);
	}
	
	public boolean esCuadrado() {
		return this.w == this.h;
	}

}
