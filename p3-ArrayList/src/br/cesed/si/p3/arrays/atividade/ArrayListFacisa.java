package br.cesed.si.p3.arrays.atividade;

import java.util.List;

/**
 * Class for my own implementation of ArrayList
 * 
 * @author aluno
 *
 */
public class ArrayListFacisa {

	private static final int DOBRO = 2;
	Object[] minhaLista;
	private int pos;

	/**
	 * Constructor 
	 * 
	 * @param tamanho the initial size of ArrayList
	 */
	public ArrayListFacisa(int tamanho) {
		minhaLista = new Object[tamanho];
		pos = 0;
	}
	
	/**
	 * Return the size of ArrayList.
	 * 
	 * @return
	 */
	public int size() {
		int contador = 0;
		for (Object list : minhaLista) {
			if(list != null){
				contador++;
			}
		}
		return contador;
	}
	
	/**
	 * Add an object
	 * 
	 * @param obj
	 */
	public void add(Object obj) {
		if(obj == null){
			throw new NullPointerException();
		}
		if(pos == minhaLista.length){
			duplicaTamanho();
		}
		minhaLista[pos] = obj;
		pos++;
	}
	
	/**
	 * Doubles the stack size
	 */
	private void duplicaTamanho(){
		Object[] copiaArray = new Object[minhaLista.length * DOBRO];
		for (int i = 0; i < minhaLista.length; i++) {
			copiaArray[i] = minhaLista[i];
		}
		minhaLista = copiaArray;
	}
	
	/**
	 * Remove an object
	 * 
	 * @param obj
	 */
	public void remove(Object obj) {
		for (int i = 0; i < minhaLista.length; i++) {
			if(obj == minhaLista[i]){
				minhaLista[i] = null;
			}
		}
		organizaArray();
	}
	
	/**
	 * Get the object by index.
	 * 
	 * For example, if I pass index as 0, this method will return the persisted value at first position of Array.
	 *  
	 * @param index index in Array
	 * @throws Exception 
	 */
	public Object getByIndex(int index) throws Exception {
		Object recebeElemento = null;
		
		if(!(index >= 0 && index < minhaLista.length)){
			throw new Exception("Posição invalida!");
		}
		
		for (int i = 0; i < minhaLista.length; i++) {
			if(minhaLista[index] == minhaLista[i]){
				recebeElemento = minhaLista[i];
			}
		}
		return recebeElemento;
	}

	/**
	 * Check the position of the informed object.
	 * 
	 * @param obj
	 * @return recebePosicao return position the object passed as a parameter
	 */
	public int findPosition(Object obj) {
		int recebePosicao = 0;
		if(obj == null){
			throw new NullPointerException();
		}
		for (int i = 0; i < minhaLista.length; i++) {
			if(minhaLista[i] != null && minhaLista[i].equals(obj)){
				recebePosicao = i;
			}
		}		
		return recebePosicao;
	}
	
	/**
	 * Show all object in array
	 */
	public void printAllElements() {
		for (int i = 0; i < minhaLista.length; i++) {
			System.out.println(minhaLista[i]);
		}
	}
	
	/**
	 * Arrange objects inside the array
	 */
	private void organizaArray(){
		Object[] copiaArray = new Object[minhaLista.length];
		int posT = 0;
		for (Object object : minhaLista) {
			if(object != null){
				copiaArray[posT] = object;
				posT++;
			}
			
		}
		minhaLista = copiaArray;
	}
	
}