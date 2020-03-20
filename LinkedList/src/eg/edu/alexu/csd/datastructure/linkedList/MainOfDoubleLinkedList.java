package eg.edu.alexu.csd.datastructure.linkedList;
import eg.edu.alexu.csd.datastructure.linkedList.DoubleLinkedList.DoubleLinkedNode;
public class MainOfDoubleLinkedList {
	 public static void main(String []args) {
		 try {
				DoubleLinkedList test=new DoubleLinkedList();
				
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
			
	 }
	 public static void show() {
		   try {
			DoubleLinkedList test=new DoubleLinkedList();
			DoubleLinkedNode node=test.head;
			while(node.nextnode!=null) {
				System.out.println(node.data);
				node=node.nextnode;
				
			}
			System.out.println(node.data);
		   }
		   catch(Exception e){
				System.out.println("sorry!");

		   }
		}
	 public static void showsublist() {
		 try {
			 DoubleLinkedList test=new DoubleLinkedList();
				DoubleLinkedNode node=test.ILinkedhead;
				while(node.nextnode!=null) {
					System.out.println(node.data);
					node=node.nextnode;
				}
				System.out.println(node.data);
			   }
			   catch(Exception e){
					System.out.println("sorry!");

			   } 
}}
