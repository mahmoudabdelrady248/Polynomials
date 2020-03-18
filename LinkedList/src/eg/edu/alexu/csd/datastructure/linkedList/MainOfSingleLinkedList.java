package eg.edu.alexu.csd.datastructure.linkedList;
import eg.edu.alexu.csd.datastructure.linkedList.SingleLinkedList.SingleLinkedNode;
public class MainOfSingleLinkedList {
	public static void main(String[]args) {
		SingleLinkedList list=new SingleLinkedList();
		list.add(4);
		list.add(5);
		list.add(6);
		list.set(2 ,7);
		list.show();System.out.println("Value at 0 index will be:"+list.get(0));
		list.sublist(1,2);
		SingleLinkedNode n=list.ILinkedhead;
		while(n.next!=null) {System.out.println(n.data);n=n.next;}System.out.println(n.data);
		System.out.println("value is found??:"+list.contains(4));
		System.out.println("size will be:"+list.size());
		System.out.println("Is list is Empty??:"+list.isEmpty());
		list.clear();
		System.out.println("size will be:"+list.size());
		System.out.println("Is list is Empty??:"+list.isEmpty());
	}
}
