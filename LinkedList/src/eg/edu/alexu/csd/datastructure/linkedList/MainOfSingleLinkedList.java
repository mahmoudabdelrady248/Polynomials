package eg.edu.alexu.csd.datastructure.linkedList;

import eg.edu.alexu.csd.datastructure.linkedList.SingleLinkedList.SingleLinkedNode;

public class MainOfSingleLinkedList {
	public static void main(String[]args) {
		    try {
				SingleLinkedList test=new SingleLinkedList();
				test.add(4);test.add(5);test.add(6);test.add("aaa");test.add(4.99);
				test.sublist(2,4);
				SingleLinkedNode n=test.head;
				while(n.next!=null) {
					System.out.println(n.data);n=n.next;
				}
				System.out.println(n.data);
				SingleLinkedNode m=test.ILinkedhead;
				while(m.next!=null) {
					System.out.println(m.data);m=m.next;
				}
				System.out.println(m.data);
			} catch (Exception e) {
				System.out.println(e.toString());
			}
	}
}