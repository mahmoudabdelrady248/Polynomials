package eg.edu.alexu.csd.datastructure.linkedList;
public class DoubleLinkedList implements ILinkedList{
	DoubleLinkedNode head,tail,headILinkedList,tailILinkedlist;
	public void add(int index,Object element) {
		DoubleLinkedNode node=new DoubleLinkedNode();
		node.data1=element.data1;node.data2=element.data2;DoubleLinkedNode n=head;
		int position=size();
		if(index==0) {
			node.nextnode=head;head.previousnode=node;head=node;
		}
		else if(position==index) {
			node.previousnode=tail;tail.nextnode=node;tail=node;
		}
		else {
			for(int i=0;i<index-1;i++) n=n.nextnode;
			DoubleLinkedNode k=n.nextnode;
			node.previousnode=n;n.nextnode=node;
			node.nextnode=k;k.previousnode=node;
		}
	}
	public void add(Object element) {
		DoubleLinkedNode node=new DoubleLinkedNode();
		node.data1=element.data1;node.data2=element.data2;
		if(head==null) { head=node;tail=node;}
		else {
			  while(tail.nextnode!=null) tail=tail.nextnode;
			  node.previousnode=tail;tail.nextnode=node;tail=node;
		}
	}
	public Object get(int index) {
		DoubleLinkedNode node=head;Object element = new Object(node.data1,node.data2);
		for(int i=0;i<index;i++) node=node.nextnode;
		element.data1=node.data1;element.data2=node.data2;
		return element;
	}
	public void set(int index,Object element) {
		DoubleLinkedNode node=new DoubleLinkedNode();
		node.data1=element.data1;node.data2=element.data2;
		DoubleLinkedNode n=head;int position=size()-1;
		if(index==0) {
			DoubleLinkedNode k=head.nextnode;
			node.nextnode=k;k.previousnode=node;head=node;
		}
		else if(position==index) {
			DoubleLinkedNode k=tail.previousnode;
			node.previousnode=k;k.nextnode=node;tail=node;
		}
		else {
			for(int i=0;i<index-1;i++) n=n.nextnode;
		    DoubleLinkedNode l=n.nextnode;
		    DoubleLinkedNode k=l.nextnode;
		    node.previousnode=n;n.nextnode=node;
		    node.nextnode=k;k.previousnode=node;
		    
		}
	}
	public void clear() {
		head=null;
	}
	public boolean isEmpty() {
		if(head==null) return true;
		else return false;
	}
	public void remove(int index) {
		DoubleLinkedNode n=head;int position=size()-1;
		if(index==0) {head=head.nextnode;head.previousnode=null;}
		else if(position==index) {tail=tail.previousnode;tail.nextnode=null;}
		else {
			for(int i=0;i<index-1;i++) n=n.nextnode;
			DoubleLinkedNode l=n.nextnode;
			DoubleLinkedNode k=l.nextnode;
		    n.nextnode=k;
		    k.previousnode=n;
		}
	}
	public int size() {
		int size=0;
		DoubleLinkedNode n=head;
		while(n!=null) {
			n=n.nextnode;size++;
		}
		return size;
	}
	public ILinkedList sublist(int fromIndex,int toIndex) {
		DoubleLinkedNode n=head;
		for(int i=0;i<fromIndex;i++) n=n.nextnode;
		for(int i=fromIndex;i<=toIndex;i++) {
			System.out.println(n.data1);n=n.nextnode;
		}
		return null;
	}
	public boolean contains(Object o) {
		DoubleLinkedNode n=head;
		while(n!=null) {
			if(n.data1==o.data1) return true;
			else n=n.nextnode;
		}
		return false;
	}
	public void show() {
		DoubleLinkedNode node=head;
		while(node.nextnode!=null) {
			System.out.println(node.data1);
			node=node.nextnode;
		}
		System.out.println(node.data1);
	}
}