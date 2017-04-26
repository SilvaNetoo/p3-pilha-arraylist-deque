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

	public int size(){
		int counter = 0;
		for (int i = 0; i < myDeque.length; i++) {
			if(myDeque[i] != null){
				counter++;
			}
		}
		return counter;
	}
	
	/**
	 * Doubles the deque size
	 */
	private void duplicateSize(){
		Object[] copyDeque = new Object[myDeque.length * DOBRO];
		for(int i = 0; i < myDeque.length; i++){
			copyDeque[i] = myDeque[i];
		}
		myDeque = copyDeque;
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
		Object[] copyMyDeque = new Object[myDeque.length];

		for(int i = inserted; i > myDeque.length; i--){
			copyMyDeque[i+1] = myDeque[i];
		}
		myDeque = copyMyDeque;
		
		myDeque[0] = obj;
		inserted++;
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
		Object[] copyMyDeque = new Object[myDeque.length];
		for(int i = inserted; i > 0; i--){
			copyMyDeque[i-1] = myDeque[i];
		}
		myDeque = copyMyDeque;
		inserted--;
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
