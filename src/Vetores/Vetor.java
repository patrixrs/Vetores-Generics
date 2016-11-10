package Vetores;

public class Vetor {
	
	private Object dados[] = new Object[2];
	private int num = 0;
	
	public void append(Object valor){		
		espaco();
		dados[num] = valor;
		num++;
	}// fim append

	public void espaco() {
		if(num < 0 || num >= dados.length){
			Object novo[] = new Object [dados.length * 2];
			for(int i = 0; i < dados.length; i++){
				novo[i] = dados[i];
			}
			dados = novo;
		}
	}// fim espaço
	
	public Object get(int index){
		validaIndex(index);
		return dados[index];
	}// fim get
	
	public int size(){
		return num;
	}// fim size
	
	public void insert(int index, Object valor){
		validaIndex(index);
		espaco();		
		for(int i = num; i > index; i--){
			dados[i] = dados[i-1];
		}
		dados[index] = valor;
		num++;		
	}// fim insert

	public void remove(int index) {
		validaIndex(index);
		for(int i = index; i < num-1; i++){
			dados[i] = dados[i+1];
		}
		num--;
	}// fim remove
	
	private void validaIndex(int index){
		if (index < 0 || index >= dados.length) {
			throw new ArrayIndexOutOfBoundsException(index);
		}		
	}
}