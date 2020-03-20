package eg.edu.alexu.csd.datastructure.linkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DoubleListTest {
   @Test
	void test() {
		DoubleLinkedList test=new DoubleLinkedList();
		test.add(1);
		test.add(2);
		test.add(3);
		assertEquals(1,test.get(0));
		assertEquals(2,test.get(1));
		assertEquals(3,test.get(2));
		assertEquals(null,test.get(50));
		assertEquals(null,test.get(40));
		test.add(2, 55);
		assertEquals(55,test.get(2));
		test.set(0, 1111);
		assertEquals(1111,test.get(0));
		assertEquals(null,test.sublist(4,0));
		Object []sub= {2,55};
		Object []sublist= {test.get(1),test.get(2)};
		assertArrayEquals(sub,sublist);
		test.remove(0);
		assertEquals(2,test.get(0));
		assertEquals(3,test.size());
        assertEquals(true,test.contains(55));
		assertEquals(false,test.contains(4));
		test.clear();
		assertEquals(true,test.isEmpty());
	}

}
