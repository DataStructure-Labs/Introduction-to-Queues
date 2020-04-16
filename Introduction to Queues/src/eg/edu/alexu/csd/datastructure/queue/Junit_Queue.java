package eg.edu.alexu.csd.datastructure.queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class Junit_Queue {
	@Test
	void LinkedBasedTest() {
		LinkedBasedQueue l =new LinkedBasedQueue();
		l.enqueue('a');
		l.enqueue(17);
		l.enqueue(18);
		l.enqueue("ahmed");
		l.enqueue(2000);
		l.enqueue("khaled");
		assertEquals(6,l.size());
		assertEquals('a',l.dequeue());
		l.enqueue("fawzy");
		l.enqueue("ibrahim");
		assertEquals(17,l.dequeue());
		assertEquals(18,l.dequeue());
		assertEquals(5,l.size());
		assertEquals("ahmed",l.dequeue());
		assertEquals(2000,l.dequeue());
		assertEquals("khaled",l.dequeue());
		assertEquals("fawzy",l.dequeue());
		assertEquals("ibrahim",l.dequeue());
		
		assertEquals(0,l.size());
		
		l.enqueue("Radwan '_'  ");
		
		assertEquals("Radwan '_'  ",l.dequeue());
		//////////////////////////////////////////
		assertThrows(RuntimeException.class,()->{l.dequeue();});
	}
	
	@Test
	void ArrayBasedTest() {
		
	}

}
