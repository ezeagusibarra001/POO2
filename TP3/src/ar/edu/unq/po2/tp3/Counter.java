package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter { 
	private ArrayList<Integer> listadoDeNumeros = new ArrayList<Integer>();

	public ArrayList<Integer> getListado() {
		return listadoDeNumeros;
	}

	public void addNumber(Integer n) {
		this.listadoDeNumeros.add(n);
	}

	public int getEvenOcurrences() {
		int evenCounter = 0;
		for (Integer n : listadoDeNumeros) {
			if (n % 2 == 0) {
				evenCounter += 1;
			}
		}
		return evenCounter;
	}

	public int getOddOcurrences() {
		int oddCounter = 0;
		for (Integer n : listadoDeNumeros) {
			if (n % 2 == 1) {
				oddCounter += 1;
			}
		}
		return oddCounter;
	}

	public int getQtyOcurrencesDividedBy(Integer n) {
		int counter = 0;
		for (Integer number : listadoDeNumeros) {
			if (number % n == 0) {
				counter += 1;
			}
		}
		return counter;
	}

	public int getBiggestNumberWithEvenOcurrences(ArrayList<Integer> ns) {
		int currentNumber = 0;
		for (Integer n : ns) {
			currentNumber = getBiggerEvenNumber(currentNumber, n);
		}
		return currentNumber;
	}

	private int getBiggerEvenNumber(int currentNumber, Integer n) {
		if (countEvenNumbers(n) >= countEvenNumbers(currentNumber)) {
			return n;
		} else {
			return currentNumber;
		}
	}

	private int countEvenNumbers(Integer n) {
		int evenCounter = 0;
		int x = n;
		while (x != 0) {
			if ((x % 10) % 2 == 0) {
				evenCounter += 1;
			}
			x = x / 10;
		}
		return evenCounter;
	}

	public boolean isMultiple(int n, int m) {
		return (n % m) == 0;
	}

	public int getBiggerMultipleOf(int x, int y) {
		int bottomRange = 0;
		int topRange = 1000;
		int currentBiggerNumber = topRange;

		while (currentBiggerNumber > bottomRange
				&& (!this.isMultiple(currentBiggerNumber, x) || !this.isMultiple(currentBiggerNumber, y))) {
			currentBiggerNumber -= 1;
		}
		
		return currentBiggerNumber == 0 ? -1 : currentBiggerNumber;
	}
}
