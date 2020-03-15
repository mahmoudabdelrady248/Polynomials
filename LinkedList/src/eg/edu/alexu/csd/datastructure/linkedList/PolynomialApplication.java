package eg.edu.alexu.csd.datastructure.linkedList;
import java.lang.Math;
public class PolynomialApplication implements IPolynomialSolver {
SingleLinkedList list1=new SingleLinkedList();
SingleLinkedList list2=new SingleLinkedList();
SingleLinkedList list3=new SingleLinkedList();
SingleLinkedList list4=new SingleLinkedList();
public void setPolynomial(char poly,int [][]terms) {
	switch(poly) {
	case 'A':
	for(int i=0;i<terms.length-1;i++) {
		for(int j=0;j<2;j++) {
			if(terms[i][1]<terms[i+1][1]) {
				int temp=terms[i][j];
				terms[i][j]=terms[i+1][j];
				terms[i+1][j]=temp;
				}
			}
		}
   	 for(int i=0;i<terms.length;i++) {
   		 list1.add(new Object(terms[i][0],terms[i][1]));
   		 
   	 }
   	break;
	case 'B':
		for(int i=0;i<terms.length-1;i++) {
			for(int j=0;j<2;j++) {
				if(terms[i][1]<terms[i+1][1]) {
					int temp=terms[i][j];
					terms[i][j]=terms[i+1][j];
					terms[i+1][j]=temp;
					}
				}
			}
	   	 for(int i=0;i<terms.length;i++) 
	   		 list2.add(new Object(terms[i][0],terms[i][1]));
	   		 break;
	case 'C':
		for(int i=0;i<terms.length-1;i++) {
			for(int j=0;j<2;j++) {
				if(terms[i][1]<terms[i+1][1]) {
					int temp=terms[i][j];
					terms[i][j]=terms[i+1][j];
					terms[i+1][j]=temp;
					}
				}
			}
	   	 for(int i=0;i<terms.length;i++) 
	   		list3.add(new Object(terms[i][0],terms[i][1]));
	   		  break;
	}
	}

public String print(char poly) {
	switch(poly) {
	case 'A':
		try {
			SingleLinkedNode n1=list1.head;
			while(n1.next!=null) {
			if((Integer)n1.data1==0) n1=n1.next;	
			else if((Integer)n1.data2==0) {
					System.out.printf("s",n1.data1+"");
					if((Integer)n1.next.data1>0) {System.out.printf(" +");n1=n1.next;}
					else n1=n1.next;
				}
			else if((Integer)n1.data1==1&&(Integer)n1.data2!=0) {
				System.out.printf("%s","x^"+n1.data2+"");
				if((Integer)n1.next.data1>0) {System.out.printf(" +");n1=n1.next;}
				else n1=n1.next;
			}
				else {
					System.out.printf("%s",n1.data1+"x^"+n1.data2+"");
					if((Integer)n1.next.data1>0) {System.out.printf(" +");n1=n1.next;}
					else n1=n1.next;
						
				}
			}
			if((Integer)n1.data1==0) break;
			else if((Integer)n1.data2==0) {System.out.printf("%s",n1.data1+"");}
			else if((Integer)n1.data1==1&&(Integer)n1.data2!=0) {System.out.printf("%s","x^"+n1.data2+"");}
			else {System.out.printf("%s",n1.data1+"x^"+n1.data2+"");}
			System.out.println("\npolynomial A is set");break;
		} catch (Exception e) {
			System.out.println("polynomial A is not set");break;
		}
		
	case 'B':
		try {
			SingleLinkedNode n2=list2.head;
			while(n2.next!=null) {
			if((Integer)n2.data1==0) n2=n2.next;	
			else if((Integer)n2.data2==0) {
					System.out.printf("s",n2.data1+"");
					if((Integer)n2.next.data1>0) {System.out.printf(" +");n2=n2.next;}
					else n2=n2.next;
				}
			else if((Integer)n2.data1==1&&(Integer)n2.data2!=0) {
				System.out.printf("%s","x^"+n2.data2+"");
				if((Integer)n2.next.data1>0) {System.out.printf(" +");n2=n2.next;}
				else n2=n2.next;
			}
				else {
					System.out.printf("%s",n2.data1+"x^"+n2.data2+"");
					if((Integer)n2.next.data1>0) {System.out.printf(" +");n2=n2.next;}
					else n2=n2.next;
						
				}
			}
			if((Integer)n2.data1==0) break;
			else if((Integer)n2.data2==0) {System.out.printf("%s",n2.data1+"");}
			else if((Integer)n2.data1==1&&(Integer)n2.data2!=0) {System.out.printf("%s","x^"+n2.data2+"");}
			else {System.out.printf("%s",n2.data1+"x^"+n2.data2+"");}
			System.out.println("\npolynomial B is set");break;
		} catch (Exception e) {
			System.out.println("polynomial B is not set");break;
		}
		
	case 'C':
		try {
			SingleLinkedNode n3=list3.head;
			while(n3.next!=null) {
			if((Integer)n3.data1==0) n3=n3.next;	
			else if((Integer)n3.data2==0) {
					System.out.printf("s",n3.data1+"");
					if((Integer)n3.next.data1>0) {System.out.printf(" +");n3=n3.next;}
					else n3=n3.next;
				}
			else if((Integer)n3.data1==1&&(Integer)n3.data2!=0) {
				System.out.printf("%s","x^"+n3.data2+"");
				if((Integer)n3.next.data1>0) {System.out.printf(" +");n3=n3.next;}
				else n3=n3.next;
			}
				else {
					System.out.printf("%s",n3.data1+"x^"+n3.data2+"");
					if((Integer)n3.next.data1>0) {System.out.printf(" +");n3=n3.next;}
					else n3=n3.next;
						
				}
			}
			if((Integer)n3.data1==0) break;
			else if((Integer)n3.data2==0) {System.out.printf("%s",n3.data1+"");}
			else if((Integer)n3.data1==1&&(Integer)n3.data2!=0) {System.out.printf("%s","x^"+n3.data2+"");}
			else {System.out.printf("%s",n3.data1+"x^"+n3.data2+"");}	
			System.out.println("\npolynomial C is set");break;
		} catch (Exception e) {
			System.out.println("polynomial C is not set");break;
		}
		
	case 'R':
		try {
			SingleLinkedNode n4=list4.head;
			while(n4.next!=null) {
			if((Integer)n4.data1==0) n4=n4.next;	
			else if((Integer)n4.data2==0) {
					System.out.printf("s",n4.data1+"");
					if((Integer)n4.next.data1>0) {System.out.printf(" +");n4=n4.next;}
					else n4=n4.next;
				}
			else if((Integer)n4.data1==1&&(Integer)n4.data2!=0) {
				System.out.printf("%s","x^"+n4.data2+"");
				if((Integer)n4.next.data1>0) {System.out.printf(" +");n4=n4.next;}
				else n4=n4.next;
			}
				else {
					System.out.printf("%s",n4.data1+"x^"+n4.data2+"");
					if((Integer)n4.next.data1>0) {System.out.printf(" +");n4=n4.next;}
					else n4=n4.next;
						
				}
			}
			if((Integer)n4.data1==0) break;
			else if((Integer)n4.data2==0) {System.out.printf("%s",n4.data1+"");}
			else if((Integer)n4.data1==1&&(Integer)n4.data2!=0) {System.out.printf("%s","x^"+n4.data2+"");}
			else {System.out.printf("%s",n4.data1+"x^"+n4.data2+"");}
			System.out.println("\npolynomial R is set");break;
		} catch (Exception e) {
			System.out.println("polynomial R is not set");break;
		}
		
	}
	
	return null;
}
public void clearPolynomial(char poly) {
	switch(poly) {
	case 'A':
		list1.clear();break;
	case 'B':
		list2.clear();break;
	case 'C':
		list3.clear();break;
	case 'R':	
		list4.clear();break;
	}
}
public float evaluatePolynomial(char poly,float value) {
	float a=0;
	switch (poly) {
	case 'A':
		SingleLinkedNode n1=list1.head;
		while(n1!=null) {
			a+=(Integer)n1.data1*Math.pow(value,(Integer)n1.data2);
			n1=n1.next;
		}break;
	case 'B':
		SingleLinkedNode n2=list2.head;
		while(n2!=null) {
			a+=(Integer)n2.data1*Math.pow(value,(Integer)n2.data2);
			n2=n2.next;
		}break;
	case 'C':
		SingleLinkedNode n3=list3.head;
		while(n3!=null) {
			a+=(Integer)n3.data1*Math.pow(value,(Integer)n3.data2);
			n3=n3.next;
		}break;
	case 'R':
		SingleLinkedNode n4=list4.head;
		while(n4!=null) {
			a+=(Integer)n4.data1*Math.pow(value,(Integer)n4.data2);
			n4=n4.next;
		}break;
	}
	return a;
}
public int [][] add(char poly1,char poly2){
	int [][]a=new int [100][2];
	switch(poly1&poly2) {
	case 'A'&'B':
		SingleLinkedNode n1=list1.head;SingleLinkedNode n2=list2.head;Integer n=0,l;
		while(n1!=null||n2!=null) {
			if(n1!=null&&n2!=null) {
				if((Integer)n1.data2<(Integer)n2.data2) {
					a[n][0]=(Integer)n2.data1;a[n][1]=(Integer)n2.data2;n2=n2.next;n++;
				}
				else if((Integer)n1.data2>(Integer)n2.data2) {
					a[n][0]=(Integer)n1.data1;a[n][1]=(Integer)n1.data2;n1=n1.next;n++;
				}
				else {
				    l=(Integer)n1.data1+(Integer)n2.data1;
					a[n][0]=l;a[n][1]=(Integer)n1.data2;n1=n1.next;n2=n2.next;n++;
				}
			}
			else if(n1==null&&n2!=null) {
				a[n][0]=(Integer)n2.data1;a[n][1]=(Integer)n2.data2;n2=n2.next;n++;
			}
			else {
				a[n][0]=(Integer)n1.data1;a[n][1]=(Integer)n1.data2;n1=n1.next;n++;
			}
		}
		for(int i=0;i<n;i++) {
			list4.add(new Object(a[i][0],a[i][1]));
		}break;
	case 'A'&'C':
		n1=list1.head;n2=list3.head;n=0;
		while(n1!=null||n2!=null) {
			if(n1!=null&&n2!=null) {
				if((Integer)n1.data2<(Integer)n2.data2) {
					a[n][0]=(Integer)n2.data1;a[n][1]=(Integer)n2.data2;n2=n2.next;n++;
				}
				else if((Integer)n1.data2>(Integer)n2.data2) {
					a[n][0]=(Integer)n1.data1;a[n][1]=(Integer)n1.data2;n1=n1.next;n++;
				}
				else {
				    l=(Integer)n1.data1+(Integer)n2.data1;
					a[n][0]=l;a[n][1]=(Integer)n1.data2;n1=n1.next;n2=n2.next;n++;
				}
			}
			else if(n1==null&&n2!=null) {
				a[n][0]=(Integer)n2.data1;a[n][1]=(Integer)n2.data2;n2=n2.next;n++;
			}
			else {
				a[n][0]=(Integer)n1.data1;a[n][1]=(Integer)n1.data2;n1=n1.next;n++;
			}
		}
		for(int i=0;i<n;i++) {
			list4.add(new Object(a[i][0],a[i][1]));
		}break;
	case 'B'&'C':
		n1=list2.head;n2=list3.head; n=0;
		while(n1!=null||n2!=null) {
			if(n1!=null&&n2!=null) {
				if((Integer)n1.data2<(Integer)n2.data2) {
					a[n][0]=(Integer)n2.data1;a[n][1]=(Integer)n2.data2;n2=n2.next;n++;
				}
				else if((Integer)n1.data2>(Integer)n2.data2) {
					a[n][0]=(Integer)n1.data1;a[n][1]=(Integer)n1.data2;n1=n1.next;n++;
				}
				else {
				    l=(Integer)n1.data1+(Integer)n2.data1;
					a[n][0]=l;a[n][1]=(Integer)n1.data2;n1=n1.next;n2=n2.next;n++;
				}
			}
			else if(n1==null&&n2!=null) {
				a[n][0]=(Integer)n2.data1;a[n][1]=(Integer)n2.data2;n2=n2.next;n++;
			}
			else {
				a[n][0]=(Integer)n1.data1;a[n][1]=(Integer)n1.data2;n1=n1.next;n++;
			}
		}
		for(int i=0;i<n;i++) {
			list4.add(new Object(a[i][0],a[i][1]));
		}break;
		}
	return a;
}
public int [][]subtract(char poly1,char poly2){
	int [][]a=new int [100][2];
	
	switch(poly1&poly2) {
	case 'A'&'B':
		SingleLinkedNode n1=list1.head;SingleLinkedNode n2=list2.head;int n=0,l;
		while(n1!=null||n2!=null) {
			if(n1!=null&&n2!=null) {
				if((Integer)n1.data2<(Integer)n2.data2) {
					a[n][0]=(Integer)n2.data1;a[n][1]=(Integer)n2.data2;n2=n2.next;n++;
				}
				else if((Integer)n1.data2>(Integer)n2.data2) {
					a[n][0]=(Integer)n1.data1;a[n][1]=(Integer)n1.data2;n1=n1.next;n++;
				}
				else {
					if(poly1=='A'&&poly2=='B') l=(Integer)n1.data1-(Integer)n2.data1;
					else l=(Integer)n2.data1-(Integer)n1.data1;
					a[n][0]=l;a[n][1]=(Integer)n1.data2;n1=n1.next;n2=n2.next;n++;
				}
			}
			else if(n1==null&&n2!=null) {
				a[n][0]=(Integer)n2.data1;a[n][1]=(Integer)n2.data2;n2=n2.next;n++;
			}
			else {
				a[n][0]=(Integer)n1.data1;a[n][1]=(Integer)n1.data2;n1=n1.next;n++;
			}
		}
		for(int i=0;i<n;i++) {
			list4.add(new Object(a[i][0],a[i][1]));
		}break;
		
		case 'A'&'C':
		if(poly1=='A'&&poly2=='C') {
		n1=list1.head;n2=list3.head;n=0;
		while(n1!=null||n2!=null) {
			if(n1!=null&&n2!=null) {
				if((Integer)n1.data2<(Integer)n2.data2) {
					a[n][0]=(Integer)n2.data1;a[n][1]=(Integer)n2.data2;n2=n2.next;n++;
				}
				else if((Integer)n1.data2>(Integer)n2.data2) {
					a[n][0]=(Integer)n1.data1;a[n][1]=(Integer)n1.data2;n1=n1.next;n++;
				}
				else {
					if(poly1=='A'&&poly2=='C') l=(Integer)n1.data1-(Integer)n2.data1;
					else l=(Integer)n2.data1-(Integer)n1.data1;
					a[n][0]=l;a[n][1]=(Integer)n1.data2;n1=n1.next;n2=n2.next;n++;
				}
			}
			else if(n1==null&&n2!=null) {
				a[n][0]=(Integer)n2.data1;a[n][1]=(Integer)n2.data2;n2=n2.next;n++;
			}
			else {
				a[n][0]=(Integer)n1.data1;a[n][1]=(Integer)n1.data2;n1=n1.next;n++;
			}
		}
		for(int i=0;i<n;i++) {
			list4.add(new Object(a[i][0],a[i][1]));
		}break;}
		
	case 'B'&'C':
		n1=list2.head;n2=list3.head;n=0;
		while(n1!=null||n2!=null) {
			if(n1!=null&&n2!=null) {
				if((Integer)n1.data2<(Integer)n2.data2) {
					a[n][0]=(Integer)n2.data1;a[n][1]=(Integer)n2.data2;n2=n2.next;n++;
				}
				else if((Integer)n1.data2>(Integer)n2.data2) {
					a[n][0]=(Integer)n1.data1;a[n][1]=(Integer)n1.data2;n1=n1.next;n++;
				}
				else {
					if(poly1=='B'&&poly2=='c') l=(Integer)n1.data1-(Integer)n2.data1;
					else l=(Integer)n2.data1-(Integer)n1.data1;
					a[n][0]=l;a[n][1]=(Integer)n1.data2;n1=n1.next;n2=n2.next;n++;
				}
			}
			else if(n1==null&&n2!=null) {
				a[n][0]=(Integer)n2.data1;a[n][1]=(Integer)n2.data2;n2=n2.next;n++;
			}
			else {
				a[n][0]=(Integer)n1.data1;a[n][1]=(Integer)n1.data2;n1=n1.next;n++;
			}
		}
		for(int i=0;i<n;i++) {
			list4.add(new Object(a[i][0],a[i][1]));
		}break;
		
		}
		
	return a;
}
public int [][] multiply(char poly1,char poly2){
	int [][]a=new int [100][2];int n=0,l=0;
	switch(poly1&poly2) {
	case 'A'&'B':
		SingleLinkedNode n1=list1.head;SingleLinkedNode n2=list2.head;
		while(n1!=null) {
			while(n2!=null) {
				a[n][0]=(Integer)n1.data1*(Integer)n2.data1;a[n][1]=(Integer)n1.data2+(Integer)n2.data2;n++;n2=n2.next;
			}
			n1=n1.next;n2=list2.head;
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i][1]==a[j][1]) {
					l+=a[i][0]+a[j][0];a[i][0]=l;
					for(int k=j;k<n-1;k++) {
						for(int m=0;m<2;m++) {
						int temp=a[k][m];
						a[k][m]=a[k+1][m];
						a[k+1][m]=temp;
						}
					}
					a[n-1][0]=0;a[n-1][1]=0;n--;
				}
			}
		}
		for(int i=0;i<n;i++) list4.add(new Object(a[i][0],a[i][1]));break;
	case 'A'&'C':
		n1=list1.head;n2=list3.head;n=0;
		while(n1!=null) {
			while(n2!=null) {
				a[n][0]=(Integer)n1.data1*(Integer)n2.data1;a[n][1]=(Integer)n1.data2+(Integer)n2.data2;n++;n2=n2.next;
			}
			n1=n1.next;n2=list3.head;
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i][1]==a[j][1]) {
					l+=a[i][0]+a[j][0];a[i][0]=l;
					for(int k=j;k<n-1;k++) {
						for(int m=0;m<2;m++) {
						int temp=a[k][m];
						a[k][m]=a[k+1][m];
						a[k+1][m]=temp;
						}
					}
					a[n-1][0]=0;a[n-1][1]=0;n--;
				}
			}
		}
		for(int i=0;i<n;i++) list4.add(new Object(a[i][0],a[i][1]));break;
	case 'B'&'C':
		n1=list2.head;n2=list3.head;n=0;
		while(n1!=null) {
			while(n2!=null) {
				a[n][0]=(Integer)n1.data1*(Integer)n2.data1;a[n][1]=(Integer)n1.data2+(Integer)n2.data2;n++;n2=n2.next;
			}
			n1=n1.next;n2=list3.head;
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i][1]==a[j][1]) {
					l+=a[i][0]+a[j][0];a[i][0]=l;
					for(int k=j;k<n-1;k++) {
						for(int m=0;m<2;m++) {
						int temp=a[k][m];
						a[k][m]=a[k+1][m];
						a[k+1][m]=temp;
						}
					}
					a[n-1][0]=0;a[n-1][1]=0;n--;
				}
			}
		}
		for(int i=0;i<n;i++) list4.add(new Object(a[i][0],a[i][1]));break;
		}
	return a;
}
}