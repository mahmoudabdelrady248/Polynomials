package eg.edu.alexu.csd.datastructure.linkedList;
public class MainOfSingleLinkedList {
	 public static void main(String []args) {
	    	SingleLinkedList list=new SingleLinkedList();
	    	list.add(new Object(4,null));
	    	list.add(new Object(5,null));
	    	list.add(new Object(6,null));
	    	list.set(2 ,new Object(7,null));
	    	list.show();System.out.println("Value at 2 index will be:"+list.get(0).data1);
	    	list.sublist(1,2);
	    	System.out.println("value is found??:"+list.contains(new Object(4,null)));
	    	System.out.println("size will be:"+list.size());
	    	System.out.println("Is list is Empty??:"+list.isEmpty());
	    	list.clear();
	    	System.out.println("size will be:"+list.size());
	    	System.out.println("Is list is Empty??:"+list.isEmpty());
	    }
}