package eg.edu.alexu.csd.datastructure.queue;

public class LinkedBasedQueue implements ILinkedBased {

	private class Node {
		Object element;
		Node next;

		private Node(Object item) {
			this.element = item;
			this.next = null;
		}
	}
	private Node head, tail;
	private int size;
	private LinkedBasedQueue() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	@Override
	public void enqueue(Object item) {
		Node extra = new Node(item);
		if (isEmpty()) {
			head = tail = extra;
		} else {
			tail.next = extra;
			tail = tail.next;
		}
		size++;
	}

	@Override
	public Object dequeue() {
		if (isEmpty()) {
			throw new RuntimeException("the queue is empty");
		}
		Object temp = this.head.element;
		this.head = this.head.next;
		this.size--;
		return temp;
	}

	@Override
	public boolean isEmpty() {
		return this.head == null;
	}

	@Override
	public int size() {
		return this.size;
	}

}
