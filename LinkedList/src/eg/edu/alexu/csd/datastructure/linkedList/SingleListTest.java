package eg.edu.alexu.csd.datastructure.linkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingleListTest {
    @Test
	void test() {
    	SingleLinkedList test=new SingleLinkedList();
 		test.add(1);test.add(2);test.add(3);test.add(4);test.add("rr");test.add(4.5);test.add('A');
 		assertEquals(1,test.get(0));assertEquals(2,test.get(1));
 		assertEquals(3,test.get(2));assertEquals(4,test.get(3));
 		assertEquals("rr",test.get(4));assertEquals(4.5,test.get(5));
 		assertEquals('A',test.get(6));
 		assertEquals(null,test.get(50));
 		assertEquals(null,test.get(40));
 		test.add(3, 55);
 		assertEquals(55,test.get(3));
 		test.set(0, 1111);
 		assertEquals(1111,test.get(0));
 		assertEquals(null,test.sublist(4,0));
 		Object []sub= {2,3,55,4};
 		Object []sublist= {test.get(1),test.get(2),test.get(3),test.get(4)};
 		assertArrayEquals(sub,sublist);
 		test.remove(0);
 		assertEquals(2,test.get(0));
 		assertEquals(7,test.size());
        assertEquals(true,test.contains(55));
 		assertEquals(false,test.contains(10));
 		test.clear();
 		assertEquals(true,test.isEmpty());
	}

}
