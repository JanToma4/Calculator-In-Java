package data_structures;

//Jan Toma, CS310
//Queue.java
import java.util.Iterator;

public class Queue<E> implements Iterable<E> {

	private ListI<E> list;

	public Queue() {
		list = new LinkedList<E>();
	}

	/**
	 * Add a generic object to the queue.
	 * @param obj - The object that is going to be added to the queue.
	 */
	public void enqueue(E obj) {
		list.addLast(obj);
	}

	/**
	 * Removes an object from the queue.
	 * @return the object removed.
	 */
	public E dequeue() {
		return list.removeFirst();	
	}

	/**
	 * Returns the number of objects in the queue.
	 * @return the number of objects in the queue.
	 */
	public int size() {
		return list.size();
	}

	/**
	 * Checks to see if the queue is empty or not.
	 * @return true if the queue is empty, false is the list is not empty.
	 */
	public boolean isEmpty() {
		return list.isEmpty();
	}

	/**
	 * Returns the first object in the queue but does not remove it.
	 * @return the first object in the queue but does not remove it.
	 */
	public E peek() {
		return list.peekFirst();
	}

	/**
	 * Checks the queue to see if it contains an object.
	 * @param obj - The object that you are checking for.
	 * @return true if it contains the object, false if it doesn't contain it.
	 */
	public boolean contains(E obj) {
		return list.contains(obj);
	}

	/**
	 * Makes the queue empty by using the linked list method makeEmpty.
	 */
	public void makeEmpty() {
		list.makeEmpty();
	}

	/**
	 * Returns an Iterator of the values in the queue, presented in
	 * the same order as the queue.
	 * @see java.lang.Iterable#iterator()
	 */
	public Iterator iterator() {
		return list.iterator();		
	}

}
