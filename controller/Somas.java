package controller;

public class Somas {

//	1. Criar uma função recursiva que receba 2 valores A e B e, por somas, apresente o resultado da
//	multiplicação de A por B.

	public Somas() {
		super();
	}
	
	public int multiplicando(int a, int b, int c) {
		int corretor = a;
		
		if(b == 1) {
			return a;
		}
		
		return a = multiplicando(a + c, diminui(b), c);
	}
	
	public int diminui(int b) {
		if(b >= 1) {
			b--;
			return b;
		}
		
		return b;
	}
	
}
