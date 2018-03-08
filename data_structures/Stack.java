package data_structures;

import java.util.Iterator;

//Jan Toma, CS310
//Stack.java
public class Stack<E> implements Iterable<E> {

	private ListI<E> list;

	public Stack() {
		list = new LinkedList<E>();
	}

	/**
	 * Pushes the object onto the stack.
	 * @param obj - The object we are pushing onto the stack.
	 */
	public void push (E obj) {
		list.addFirst(obj);
	}

	/**
	 * Pops the object off of the list.
	 * @return the object removed.
	 */
	public E pop() {
		return list.removeFirst();
	}

	/**
	 * Returns the number of objects in the stack.
	 * @return the number of objects in the stack.
	 */
	public int size() {
		return list.size();
	}

	/**
	 * Checks to see if the stack is empty or not.
	 * @return true if the stack is empty, false if it is not empty.
	 */
	public boolean isEmpty() {
		return list.isEmpty();
	}

	/**
	 * Checks to see if the stack is full.
	 * @return true if it full, false if it is not full.
	 */
	public boolean isFull() {
		return list.isFull();
	}

	/**
	 * Returns the first object in the stack but does not remove it.
	 * @return the first object in the stack but does not remove it.
	 */
	public E peek() {
		return list.peekFirst();	
	}

	/**
	 * Checks the stack to see if it contains an object.
	 * @param obj - The object that you are checking for.
	 * @return true if the stack contains the object, false if it doesn't.
	 */
	public boolean contains(E obj) {
		return list.contains(obj);
	}

	/**
	 * Makes the stack empty.
	 */
	public void makeEmpty() {
		list.makeEmpty();
	}

	/**
	 * Returns an Iterator of the values in the stack, presented in
	 * the same order as the stack.
	 * @see java.lang.Iterable#iterator()
	 */
	public Iterator<E> iterator() {
		return list.iterator();
	}
}
