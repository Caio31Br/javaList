package lista;

import java.util.*;

public class Exercicio1 {
	private int A;
	private int B;
	private int C;
	private int soma;
	
	//setando
	public void setA(int a) {
		A = a;
	}
	
	public void setB(int b) {
		B = b;
	}
	
	public void setC(int c) {
		C = c;
	}
	
	//Soma A  + B
	public int getresult() {
		soma = A + B;
		return soma;
	}
	
	public int getA() {
		return A;
	}
	
	public int getB() {
		return B;
	}
	
	public int getC() {
		return C;
	}
	
	public static void main (String args[]) {
		Exercicio1 obj = new Exercicio1();
		Scanner input = new Scanner(System.in);
		
		//var
		int Valor;
		
		//armazenar os dados
		System.out.println("Escreva o valor A ");
		Valor = input.nextInt();//entradad de dados
		obj.setA(Valor);
		
		System.out.println("Escreva o valor B ");
		Valor = input.nextInt();//entradad de dados
		obj.setB(Valor);
		
		System.out.println("Escreva o valor C ");
		Valor = input.nextInt();//entradad de dados
		obj.setC(Valor);
		
		System.out.println(obj.getA() + " + " + obj.getB() + " = " + obj.getresult());
		//saida de dados
		if(obj.getresult() < obj.getC()) {
			System.out.println("a soma é menor que "+ obj.getC());
		}
		
	}
}
