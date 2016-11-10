package VetoresGenerics;

import com.senac.SimpleJava.Console;

public class TesteDeVetores {
	public void run() {
		Console.println("Teste dos Vetores");
		
		Vetor<Integer> vetor = new Vetor<>();
		
		vetor.append(1);
		vetor.append(2);
		vetor.append(3);
		vetor.append(4);
		vetor.append(5);
		vetor.append(6);
		vetor.append(7);
		vetor.insert(0, 20);

		int soma = 0;
		for (int i = 0; i < vetor.size(); i++) {
			soma += (Integer)vetor.get(i);
		}
		System.out.println("Soma = " + soma);
		
		for (int i = 0; i < vetor.size(); i++) {
			Console.println(i, " " ,vetor.get(i));
		}
		
		vetor.remove(2);
		for (int i = 0; i < vetor.size(); i++) {
			Console.println(i, " " ,vetor.get(i));
		}		
	}
}