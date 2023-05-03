package br.com.fiap.strings.view;

import javax.swing.JOptionPane;

public class pratica1 {
	public static void main(String[] args) {
		String nomeMinusculo = JOptionPane.showInputDialog("Digite o nome Minusculo");
		
		String maiuscula =nomeMinusculo.toUpperCase();
		
		System.out.println(maiuscula);
	
		String vogal1 = nomeMinusculo.replace("a","*");
		String vogal2 = vogal1.replace("e","*");
		String vogal3 = vogal2.replace("i","*");
		String vogal4 = vogal3.replace("o","*");
		String vogal5 = vogal4.replace("u","*");
		
	
		System.out.println(vogal5);
	}

}
