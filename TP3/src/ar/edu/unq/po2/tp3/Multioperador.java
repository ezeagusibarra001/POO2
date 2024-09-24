package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	private ArrayList<Integer> listadoDeNumeros = new ArrayList<Integer>();

	public Multioperador(ArrayList<Integer> listadoDeNumeros) {
		this.setListadoDeNumeros(listadoDeNumeros);
	}

	public ArrayList<Integer> getListadoDeNumeros() {
		return listadoDeNumeros;
	}

	public void setListadoDeNumeros(ArrayList<Integer> listadoDeNumeros) {
		this.listadoDeNumeros = listadoDeNumeros;
	}
	
	
	public int addAll() {
		int acc = 0;
		for (Integer n : listadoDeNumeros) {
			acc += n;
		}
		return acc;
	}
	
	public int subtractAll() {
		int acc = 0;
		for (Integer n : listadoDeNumeros) {
			acc -= n;
		}
		return acc;
	}
	
	public int multiplyAll() {
		int acc = 1;
		for (Integer n : listadoDeNumeros) {
			acc = acc * n;
		}
		return acc;
	}
	

}
