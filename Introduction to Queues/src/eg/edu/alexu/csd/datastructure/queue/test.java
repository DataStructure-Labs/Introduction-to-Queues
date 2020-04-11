package eg.edu.alexu.csd.datastructure.queue;

public class test {

	public static void main(String[] args) {
		LinkedBasedQueue l = new LinkedBasedQueue();
		l.enqueue("ahmed");
		l.enqueue(2000);
		l.enqueue("khaled");
		System.out.println(l.size());
		System.out.println(l.dequeue());
		System.out.println(l.size());
		l.enqueue("ibrahim");
		l.enqueue(12);
		l.enqueue("fawzy");
		System.out.println(l.dequeue());
		System.out.println(l.dequeue());
		System.out.println(l.dequeue());
		System.out.println(l.dequeue());
		System.out.println(l.size());
		System.out.println(l.dequeue());
		System.out.println(l.size());
		System.out.println(l.dequeue());
	}

}
