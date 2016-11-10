package Vetores;

import com.senac.SimpleJava.Console;

public class Programa {

	public void run() {
		
		Vetor vetor = new Vetor();
		
		vetor.append(1);
		vetor.append(2);
		vetor.append(3);
		vetor.append("Icaro");
		vetor.append(5);
		vetor.append(6);
		vetor.append(7);
		
		int soma = 0;
		for (int i = 0; i < vetor.size(); i++) {
			if(vetor.get(i) instanceof Integer){
				soma += (Integer)vetor.get(i);
			}
		}
		
		Console.print("SOMA SOMENTE DOS INTEIROS:"+soma);
		
		Console.println("\n\nAPPEND INSERE NO FINAL DO VETOR");
		for (int i = 0; i < vetor.size(); i++) {
			Console.println("["+i+"]" + " " + vetor.get(i));
		}
		
		vetor.insert(1, 20);
		Console.println("\nINSERT 20 NO INDEX 1 AUMENTANDO O NUM DE ELEMENTOS");
		for (int i = 0; i < vetor.size(); i++) {
			Console.println("["+i+"]" + " " + vetor.get(i));
		}
		
		vetor.remove(2);
		Console.println("\nREMOVE O INDEX 2");
		for (int i = 0; i < vetor.size(); i++) {
			Console.println("["+i+"]" + " " + vetor.get(i));
		}		
	}
	
}