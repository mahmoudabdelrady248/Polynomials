package eg.edu.alexu.csd.datastructure.linkedList;
import eg.edu.alexu.csd.datastructure.linkedList.DoubleLinkedList.DoubleLinkedNode;
public class MainOfDoubleLinkedList {
	 public static void main(String []args) {
			DoubleLinkedList list=new DoubleLinkedList();
			list.add(4);
			list.add(5);
			list.add(6);
			list.add(7);
			list.add(2,9);
			list.add(4,3);
			list.show();
			list.set(5,10);list.set(0,1);
			list.set(2,11);list.show();
			list.remove(0);list.remove(4);list.remove(2);list.show();
			System.out.println("Value at 2 index will be:"+list.get(2));
			System.out.println(list.isEmpty());System.out.println("size after delete will be:"+list.size());
			list.sublist(1, 2);
			DoubleLinkedNode n=list.ILinkedhead;
			while(n.nextnode!=null) {System.out.println(n.data);n=n.nextnode;}System.out.println(n.data);
			System.out.println(list.contains(10));
			list.clear();
			System.out.println("size after delete all elements will be:"+list.size());
			System.out.println(list.isEmpty());
			
	 }
}
