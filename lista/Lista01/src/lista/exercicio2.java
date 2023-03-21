package lista;

import java.util.*;
public class exercicio2 {
	private String Name;
	private String Sexo;
	private String Ecivil;
	
	public void setName(String name) {
		Name = name;
	}
	
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	
	public void setEstCivil(String Civil) {
		Ecivil = Civil;
	}
	
	public String getName() {
		return Name;
	}
	
	public String getSexo() {
		return Sexo;
	}
	
	public String getEstCivil() {
		return Ecivil;
	}
	
	
	public static void main(String args[]) {
		exercicio2 obj = new exercicio2();
		Scanner input = new Scanner(System.in);
		
		String info;
		int tempo = -1;
		
		//armazenar dados
		System.out.println("informe seu nome ");
		info = input.nextLine();//entradad de dados
		obj.setName(info);
		
		System.out.println("informe seu sexo (F/M) ");
		info = input.nextLine();//entradad de dados
		obj.setSexo(info);
		
		System.out.println("informe seu Estado civil (soltera/CASADA)");
		info = input.nextLine();//entradad de dados
		obj.setEstCivil(info);
		
		if(obj.getSexo().equals("F") && obj.getEstCivil().equalsIgnoreCase("CASADA")) {
			System.out.println("digite o tempo de casada, se for menos de 1 digite 0: ");
			tempo = input.nextInt();
		}
		
		//saida de dados
		System.out.println("Nome :" + obj.getName());
		System.out.println("Nome :" + obj.getSexo());
		System.out.println("Nome :" + obj.getEstCivil());
		if(tempo != -1) {
			System.out.println("tempo de casada: " + tempo);
		}
		
	}
	
	
}
