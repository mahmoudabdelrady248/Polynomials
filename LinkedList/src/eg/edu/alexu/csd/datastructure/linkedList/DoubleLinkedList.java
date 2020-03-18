package eg.edu.alexu.csd.datastructure.linkedList;
public class DoubleLinkedList implements ILinkedList{
	class DoubleLinkedNode{
		Object data;DoubleLinkedNode nextnode,previousnode;
	}
	DoubleLinkedNode head,tail,ILinkedhead,ILinkedtail;
	public void add(int index,Object element) {
		DoubleLinkedNode node=new DoubleLinkedNode();
		node.data=element;DoubleLinkedNode n=head;
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
		node.data=element;
		if(head==null) { head=node;tail=node;}
		else {
			  while(tail.nextnode!=null) tail=tail.nextnode;
			  node.previousnode=tail;tail.nextnode=node;tail=node;
		}
	}
	public Object get(int index) {
		DoubleLinkedNode node=head;Object element;
		for(int i=0;i<index;i++) node=node.nextnode;
		element=node.data;
		return element;
	}
	public void set(int index,Object element) {
		DoubleLinkedNode node=new DoubleLinkedNode();
		node.data=element;
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
		DoubleLinkedNode n=head;ILinkedList list=new ILinkedList() {
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
				return null;
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
			  DoubleLinkedNode node=new DoubleLinkedNode();
			  node.data=element;
			  if(ILinkedhead==null) {ILinkedhead=node;ILinkedtail=node;}
			  else {
				  while(ILinkedtail.nextnode!=null) ILinkedtail=ILinkedtail.nextnode;
				  ILinkedtail.nextnode=node;node.previousnode=ILinkedtail;
				  ILinkedtail=node;
			  }
				
			}
			
			@Override
			public void add(int index, Object element) {
				// TODO Auto-generated method stub
				
			}
		};
		for(int i=0;i<fromIndex;i++) n=n.nextnode;
		for(int i=fromIndex;i<=toIndex;i++) {
			list.add(get(i));
		}
		;return list;
	}
	public boolean contains(Object o) {
		DoubleLinkedNode n=head;
		while(n!=null) {
			if(n.data==o) return true;
			else n=n.nextnode;
		}
		return false;
	}
	public void show() {
		DoubleLinkedNode node=head;
		while(node.nextnode!=null) {
			System.out.println(node.data);
			node=node.nextnode;
		}
		System.out.println(node.data);
	}
}