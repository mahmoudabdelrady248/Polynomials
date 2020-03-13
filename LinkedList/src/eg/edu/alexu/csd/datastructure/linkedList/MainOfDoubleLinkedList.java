package eg.edu.alexu.csd.datastructure.linkedList;
public class MainOfDoubleLinkedList {
	 public static void main(String []args) {
			DoubleLinkedList list=new DoubleLinkedList();
			list.add(new Object(4,null));
			list.add(new Object(5,null));
			list.add(new Object(6,null));
			list.add(new Object(7,null));
			list.add(2,new Object(9,null));
			list.add(5, new Object(3,null));
			list.show();
			System.out.println("Value at 3 index will be:"+list.get(3).data1);
			list.set(5,new Object(10,null));
			list.remove(0);list.show();
			System.out.println(list.isEmpty());System.out.println("size after delete will be:"+list.size());
			list.sublist(2, 4);
			System.out.println(list.contains(new Object(10,null)));
			list.clear();
			System.out.println("size after delete all elements will be:"+list.size());
			System.out.println(list.isEmpty());
			
	 }
}
