package eg.edu.alexu.csd.datastructure.linkedList;
public class SingleLinkedList {
SingleLinkedNode head;
public void add(int index,Object element) {
	SingleLinkedNode node=new SingleLinkedNode();
	node.data1=element.data1;node.data2=element.data2;
	SingleLinkedNode tail=head;
	if(index==0) {
	  node.next=head;
	  head=node;
	}
	else {
		for(int i=0;i<index-1;i++) tail=tail.next;
		node.next=tail.next;tail.next=node;
	}
}
public void add(Object element) {
	SingleLinkedNode node=new SingleLinkedNode();
	node.data1=element.data1;node.data2=element.data2;
	if(head==null) head=node;
	else {
		SingleLinkedNode tail=head;
		while(tail.next!=null) tail=tail.next;
		tail.next=node;
	}
}
public Object get(int index) {
	SingleLinkedNode node=head;Object element = new Object(node.data1,node.data2);
	for(int i=0;i<index;i++) node=node.next;
	element.data1=node.data1;element.data2=node.data2;
	return element;
	
}
public void set(int index,Object element) {
	SingleLinkedNode node=new SingleLinkedNode();
	node.data1=element.data1;node.data2=element.data2;
	SingleLinkedNode n=head;
	if(index==0) {
		node.next=n.next;
		head=node;
	}
	else {
	for(int i=0;i<index-1;i++) n=n.next;
	SingleLinkedNode l=n.next;
	SingleLinkedNode k=l.next;
	node.next=k;n.next=node;
	}
}
public void clear() {
	head=null;
}
public boolean isEmpty() {
	if(head!=null) return false;
	else return true;
}
public void remove(int index) {
	SingleLinkedNode tail=head;SingleLinkedNode n;
	if(index==0) head=head.next;
	else {
		for(int i=0;i<index-1;i++) tail=tail.next;
		n=tail.next;
		tail.next=n.next;
	}
	
}
public int size() {
	int size=0;SingleLinkedNode tail=head;
	while(tail!=null) {
		tail=tail.next;size++;
	}
	return size;
}
public ILinkedList sublist(int fromIndex,int toIndex) {
	SingleLinkedNode n=head;ILinkedList list=new ILinkedList(n);
	for(int i=0;i<fromIndex;i++) n=n.next;
	for(int i=fromIndex;i<=toIndex;i++) {
		list.n1.data1=n.data1;System.out.println(n.data1);n=n.next;
	}
	return list;
}
public boolean contain(Object o) {
	SingleLinkedNode tail=head;
	while(tail!=null) {
		if(tail.data1==o.data1) return true;
		else tail=tail.next;
	}
	return false;
}
public void show() {
	SingleLinkedNode node=head;
	while(node.next!=null) {
		System.out.println(node.data1);
		node=node.next;
	}
	System.out.println(node.data1);
}
}
