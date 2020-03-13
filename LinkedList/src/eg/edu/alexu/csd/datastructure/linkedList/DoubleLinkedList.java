package eg.edu.alexu.csd.datastructure.linkedList;
public class DoubleLinkedList{
	DoubleLinkedNode head;
	public void add(int index,Object element) {
		DoubleLinkedNode node=new DoubleLinkedNode();
		node.data1=element.data1;node.data2=element.data2;DoubleLinkedNode n=head;
		if(index==0) {
			node.nextnode=head;head.previousnode=node;head=node;
		}
		else {
			for(int i=0;i<index-1;i++) n=n.nextnode;
            DoubleLinkedNode k=n.nextnode;
            n.nextnode=node;node.previousnode=n;node.nextnode=k;
		}
	}
	public void add(Object element) {
		DoubleLinkedNode node=new DoubleLinkedNode();
		node.data1=element.data1;node.data2=element.data2;DoubleLinkedNode tail=node;
		if(head==null) head=node;
		else {
			  DoubleLinkedNode n=head;
		      while(n.nextnode!=null) n=n.nextnode;
		      n.nextnode=tail;tail.previousnode=n;
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
		DoubleLinkedNode n=head;
		if(index==0) {
			DoubleLinkedNode k=n.nextnode;
			node.nextnode=k;k.previousnode=node;head=node;
		}
		else {
			for(int i=0;i<index-1;i++) n=n.nextnode;
		    DoubleLinkedNode l=n.nextnode;
		    DoubleLinkedNode k=l.nextnode;
		    try {
		    	 k.previousnode=node;node.nextnode=k;n.nextnode=node;node.previousnode=n;
			} catch (Exception e) {
				node.nextnode=k;n.nextnode=node;node.previousnode=n;
			}
		    
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
		DoubleLinkedNode n=head;
		if(index==0) {
			DoubleLinkedNode k=n.nextnode;
			head=k;k.previousnode=head;
		}
		else {
			for(int i=0;i<index-1;i++) n=n.nextnode;
		    DoubleLinkedNode l=n.nextnode;
		    DoubleLinkedNode k=l.nextnode;
		    n.nextnode=k;k.previousnode=n;
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
		DoubleLinkedNode n=head;ILinkedList list=new ILinkedList(n);
		for(int i=0;i<fromIndex;i++) n=n.nextnode;
		for(int i=fromIndex;i<=toIndex;i++) {
			list.n2.data1=n.data1;System.out.println(n.data1);n=n.nextnode;
		}
		return list;
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