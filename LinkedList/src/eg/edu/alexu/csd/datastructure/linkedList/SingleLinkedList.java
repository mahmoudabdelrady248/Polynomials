package eg.edu.alexu.csd.datastructure.linkedList;
public class SingleLinkedList {
	class SingleLinkedNode{
		Object data;
		SingleLinkedNode next;
	}
SingleLinkedNode head,ILinkedhead;
SingleLinkedNode n=new SingleLinkedNode();
public void add(int index,Object element) {
	
	SingleLinkedNode node=new SingleLinkedNode();
	node.data=element;
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
	node.data=element;
	if(head==null) head=node;
	else {
		SingleLinkedNode tail=head;
		while(tail.next!=null) tail=tail.next;
		tail.next=node;
	}
	
}
public Object get(int index) {
	SingleLinkedNode node=head;Object element;
	for(int i=0;i<index;i++) node=node.next;
	element=node.data;
	return element;
	
}
public void set(int index,Object element) {
	SingleLinkedNode node=new SingleLinkedNode();
	node.data=element;
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
	SingleLinkedNode n=head;ILinkedList list=new ILinkedList() {
		@Override
		public ILinkedList sublist(int fromIndex, int toIndex) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public void set(int index, Object element) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void remove(int index) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public Object get(int index) {
			// TODO Auto-generated method stub
			return index;
		}
		
		@Override
		public boolean contains(Object o) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void add(Object element) {
			SingleLinkedNode n=new SingleLinkedNode();
			n.data=element;
			if(ILinkedhead==null) ILinkedhead=n;
			else {
				SingleLinkedNode m=ILinkedhead;
				while(m.next!=null) m=m.next;
				m.next=n;
			}
			
		}
		
		@Override
		public void add(int index, Object element) {
			// TODO Auto-generated method stub
			
		}
		
	};
for(int i=0;i<fromIndex;i++) n=n.next;
	for(int i=fromIndex;i<=toIndex;i++) {
		list.add(get(i));
	}
  return list;
}
public boolean contains(Object o) {
	SingleLinkedNode tail=head;
	while(tail!=null) {
		if(tail.data==o) return true;
		else tail=tail.next;
	}
	return false;
}

public void show() {
	SingleLinkedNode node=head;
	while(node.next!=null) {
		System.out.println(node.data);
		node=node.next;
		
	}
	System.out.println(node.data);
	
}
}
