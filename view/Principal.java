package view;

import javax.swing.JOptionPane;

import controller.Somas;

public class Principal {

	public static void main(String[] args) {
		Somas soma = new Somas();
		
		int a, b;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));
		
		 int c = a;
		
		System.out.println(soma.multiplicando(a, b, c));
		

	}

}
