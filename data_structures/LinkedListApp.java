package data_structures;

//Jan Toma, CS310
public class LinkedListApp {
	public static void main (String [] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<String> listS = new LinkedList<String>();
		LinkedList<Double> listD = new LinkedList<Double>();
		Stack<Integer> stack = new Stack<Integer>();
		Queue<Integer> queue = new Queue<Integer>();

		int i = 0;
		for(i = 0; i < 10; i++) {
			list.addFirst(i);
			list.addLast(i);
			list.removeFirst();
			list.removeLast();
		}
		list.addFirst(1223);
		list.addFirst(12982112);
		list.addLast(97987);
		list.addLast(77868);
		list.removeFirst();
		list.removeLast();
		System.out.println("Printing contents of list:");
		for (Integer in : list) {
			System.out.print(in + " ");
		}
		System.out.println();
		System.out.println("Size: " + list.size());
		System.out.println("Contains (123): " + list.contains(123));
		System.out.println("Contains (1): " + list.contains(1));
		System.out.println("Size : " + list.size());
		System.out.println("First Data: " + list.peekFirst());
		System.out.println("Last Data: " + list.peekLast());
		System.out.println("Emptying List Now!!!!" + "\n" + "----------");
		list.makeEmpty();
		System.out.println("Size: " + list.size());
		System.out.println("Empty?: " + list.isEmpty());
		System.out.println("Full?: " + list.isFull());
		System.out.println("First Data: " + list.peekFirst());
		System.out.println("Last Data: " + list.peekLast());

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n\n\n");

		listS.addFirst("bananna");
		listS.addFirst("orange");
		listS.addFirst("apple");
		listS.addFirst("lemon");
		listS.addFirst("tomato");
		listS.addFirst("lettuce");
		listS.addLast("pizza");
		listS.addLast("chicken");
		listS.addLast("snacks");
		System.out.println("Printing contents of stack:");
		for (String in : listS) {
			System.out.print(in + " ");
		}
		System.out.println();
		listS.removeLast();
		listS.removeLast();
		listS.removeFirst();
		System.out.println("Printing contents of listS:");
		for (String in : listS) {
			System.out.print(in + " ");
		}
		System.out.println();
		System.out.println("Size: " + listS.size());
		System.out.println("First data: " + listS.peekFirst());
		System.out.println("Last data: " + listS.peekLast());
		System.out.println("Contains (bananna): " + listS.contains("bananna"));
		System.out.println("Contains (orange): " + listS.contains("orange"));
		System.out.println("Contains (apple): " + listS.contains("apple"));
		System.out.println("Contains (lemon): " + listS.contains("lemon"));
		System.out.println("Contains (tomato): " + listS.contains("tomato"));
		System.out.println("Contains (lettuce): " + listS.contains("lettuce"));
		System.out.println("Contains (pizza): " + listS.contains("pizza"));
		System.out.println("Contains (chicken): " + listS.contains("chicken"));
		System.out.println("Contains (snacks): " + listS.contains("snacks"));
		System.out.println("Empty?: " + listS.isEmpty());
		System.out.println("Emptying List Now!!!!" + "\n" + "----------");
		listS.makeEmpty();
		System.out.println("Size: " + listS.size());
		System.out.println("Empty?: " + listS.isEmpty());
		System.out.println("Full?: " + listS.isFull());

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n\n\n");

		listD.addFirst(2.0);
		listD.addFirst(8.0);
		listD.addFirst(218.0);
		listD.addLast(-129.0);
		listD.addLast(222.222);
		listD.addLast(22.0);
		listD.removeFirst();
		listD.removeLast();
		System.out.println("Printing contents of listD:");
		for (Double in : listD) {
			System.out.print(in + " ");
		}
		System.out.println();
		System.out.println("Has next()?: " + listD.iterator().hasNext());
		System.out.println("Has next()?: " + listD.iterator().next());
		System.out.println("Size: " + listD.size());
		System.out.println("First data: " + listD.peekFirst());
		System.out.println("Last data: " + listD.peekLast());
		System.out.println("Contains (2.0): " + listD.contains(2.0));
		System.out.println("Contains (3212.0): " + listD.contains(3213.0));
		System.out.println("Contains (123.0): " + listD.contains(123.0));
		System.out.println("Contains (5325.0): " + listD.contains(5325.0));
		System.out.println("Emptying List Now!!!!" + "\n" + "----------");
		listD.makeEmpty();
		System.out.println("Size: " + listD.size());
		System.out.println("Empty?: " + listD.isEmpty());
		System.out.println("Full?: " + listD.isFull());
		System.out.println("Contains (22.0): " + listD.contains(22.0)); 

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n\n\n");

		stack.push(2);
		stack.push(423);
		stack.push(123);
		System.out.println("Size: " + stack.size());
		System.out.println("Empty?: " + stack.isEmpty());
		System.out.println("Full?: " + stack.isFull());
		System.out.println("Peek: " + stack.peek());
		stack.pop();
		System.out.println("Size: " + stack.size());
		System.out.println("Printing contents of stack:");
		for (Integer in : stack) {
			System.out.print(in + " ");
		}
		System.out.println();
		System.out.println("Contains (2): " + stack.contains(2));
		System.out.println("Contains (423): " + stack.contains(423));
		System.out.println("Contains (413): " + stack.contains(413));
		System.out.println("Contains (4224): " + stack.contains(4224));
		System.out.println("Emptying List Now!!!!" + "\n" + "----------");
		stack.makeEmpty();
		System.out.println("Size: " + stack.size());
		System.out.println("Empty?: " + stack.isEmpty());
		System.out.println("Full?: " + stack.isFull());
		System.out.println("Peek: " + stack.peek());
		System.out.println("Contains (2): " + stack.contains(2));

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n\n\n");

		queue.enqueue(33);
		queue.enqueue(2243);
		queue.enqueue(983);
		queue.enqueue(12344);
		queue.dequeue();
		queue.dequeue();
		System.out.println("Printing contents of queue:");
		for (Integer in : queue) {
			System.out.print(in + " ");
		}
		System.out.println();
		System.out.println("Peek: " + queue.peek());
		System.out.println("Size: " + queue.size());
		System.out.println("Empty?: " + queue.isEmpty());
		System.out.println("Contains (33): " + queue.contains(33));
		System.out.println("Contains (983): " + queue.contains(983));
		System.out.println("Emptying List Now!!!!" + "\n" + "----------");
		queue.makeEmpty();
		System.out.println("Peek: " + queue.peek());
		System.out.println("Size: " + queue.size());
		System.out.println("Empty?: " + queue.isEmpty());
		System.out.println("Contains (33): " + queue.contains(33));

	}
}
