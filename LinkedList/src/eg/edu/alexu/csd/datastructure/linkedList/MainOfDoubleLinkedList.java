package eg.edu.alexu.csd.datastructure.linkedList;
public class MainOfDoubleLinkedList {
	 public static void main(String []args) {
			DoubleLinkedList list=new DoubleLinkedList();
			list.add(new Object(4,null));
			list.add(new Object(5,null));
			list.add(new Object(6,null));
			list.add(new Object(7,null));
			list.add(2,new Object(9,null));
			list.add(4, new Object(3,null));
			list.show();
			list.set(5,new Object(10,null));list.set(0,new Object(1,null));
			list.set(2,new Object(11,null));list.show();
			list.remove(0);list.remove(4);list.remove(2);list.show();
			System.out.println("Value at 2 index will be:"+list.get(2).data1);
			System.out.println(list.isEmpty());System.out.println("size after delete will be:"+list.size());
			list.sublist(1, 2);
			System.out.println(list.contains(new Object(10,null)));
			list.clear();
			System.out.println("size after delete all elements will be:"+list.size());
			System.out.println(list.isEmpty());
			
	 }
}
