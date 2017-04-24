package br.cesed.si.p3.deque;

/**
 * Class for my own implementation of deque
 * @author Neto
 *
 */
public class Deque{

	private Object[] myDeque;
	private int inserted;
	private static final int DOBRO = 2;

	/**
	 * Constructor
	 * 
	 * @param size the initial size of myDeque
	 */
	public Deque(int size){
		myDeque = new Object[size];
	}

	/**
	 * Doubles the deque size
	 */
	private void duplicateSize(){
		Object[] copiaDeque = new Object[myDeque.length * DOBRO];
		for(int i = 0; i < myDeque.length; i++){
			copiaDeque[i] = myDeque[i];
		}
		myDeque = copiaDeque;
	}

	/**
	 * Add the obj of the type Object in last position of deque
	 * @param obj object passed with param
	 */
	public void addFinal(Object obj){
		if(inserted == myDeque.length){
			duplicateSize();
		}

		myDeque[inserted++] = obj;
	}

	/**
	 * Add the obj of the type Object in first position of deque
	 * @param obj object passed with param
	 */
	public void addInit(Object obj){
		if(inserted == myDeque.length){
			duplicateSize();
		}
		Object[] copiaMyDeque = new Object[myDeque.length];

		for(int i = inserted; i > myDeque.length; i--){
			copiaMyDeque[i+1] = myDeque[i];
		}
		myDeque = copiaMyDeque;
		
		myDeque[0] = obj;
	}

	/**
	 * Remove the object in last position of deque
	 */
	public void removeFinal(){
		myDeque[inserted--] = myDeque[inserted + 1];
	}

	/**
	 * Remove the object in first position of deque
	 */
	public void removeInit(){
		Object[] copiaMyDeque = new Object[myDeque.length];
		for(int i = inserted; i > 0; i--){
			copiaMyDeque[i-1] = myDeque[i];
		}
		myDeque = copiaMyDeque;
	}
	
	/**
	 * Return the last element of deque
	 * @return return the last element of deque
	 */
	public Object getLastObj(){
		return myDeque[inserted - 1];
	}
	
	/**
	 * Return the first element of deque
	 * @return return the first element of deque
	 */
	public Object getFirstObj(){
		return myDeque[0];
	}
}
