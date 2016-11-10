package VetoresGenerics;

public class Vetor <T> {

	@SuppressWarnings("unchecked")
	private T[] dados = (T[])new Object[2];
	private int numElementos = 0;

	public void append(T valor) {
		aumentaEspaco();
		dados [numElementos] = valor;
		numElementos++;
	}//fecha metodo

	public void aumentaEspaco(){
		if (numElementos >= dados.length){
			@SuppressWarnings("unchecked")
			T[] novo = (T[])new Object[dados.length*2];
			for(int i = 0; i<dados.length;i++ ){
				novo[i] = dados[i];
			}//fecha for
			dados = novo;
		}//fecha if
	}//fecha metodo

	public T get(int index) {
		validaIndex(index);
		return dados[index];
	}

	public int size() {
		return numElementos;
	}

	public void insert(int index, T valor) {
		validaIndex(index);
		aumentaEspaco();
		for(int i = numElementos; i > index; i--){
			dados[i] = dados[i-1];			
		}
		dados[index] = valor;
		numElementos++;
	}

	private void validaIndex(int index) {
		if(index < 0 || index >= dados.length){
			throw new ArrayIndexOutOfBoundsException(index);
		} 
	}
	
	public void remove(int index) {
		validaIndex(index);
		for (int i = index; i < numElementos-1; i++) {
			dados[i] = dados[i+1];
		}
		numElementos--;
	}

}//fecha classe