package br.cesed.si.p3.pilha;

/**
 * Class for my own implementation of stack
 * @author Neto
 *
 */
public class OwnPilha {

	private static final int DOUBLE = 2;
	private Object[] ownPilha;
	private int position;
	
	/**
	 * Constructor
	 * 
	 * @param tamanho the initial size of stack
	 */
	public OwnPilha(int tamanho){
		this.ownPilha = new Object[tamanho];
	}
	
	/**
	 * Return the size of the own stack
	 * @return position return the position
	 */
	public int size(){
		return position;
	}
	
	/**
	 * Adds the passed object obj as a parameter to the stack on last position
	 * @param obj
	 */
	public void push(Object obj){
		if(position >= ownPilha.length){
			duplicationSize();
		}
		ownPilha[position++] = obj;
	}

	/**
	 * Doubles the stack size
	 */
	private void duplicationSize() {
		Object[] copiaPilha = new Object[ownPilha.length * DOUBLE];
		for (int i = 0; i < copiaPilha.length; i++) {
			copiaPilha[i] = ownPilha[i];
		}
		ownPilha = copiaPilha;
	}
	
	/**
	 * Remove the object of the last position
	 */
	public void pop(){
		ownPilha[position--] = ownPilha[position + 1];
	}
	
	/**
	 * Show who's on last position in stack
	 * @return return last position in stack
	 */
	public Object top(){
		return ownPilha[position - 1];
	}
}
