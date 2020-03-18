package eg.edu.alexu.csd.datastructure.linkedList;
import eg.edu.alexu.csd.datastructure.linkedList.SingleLinkedList.SingleLinkedNode;
public class PolynomialSolver implements IPolynomialSolver {
	SingleLinkedList list1=new SingleLinkedList();
	SingleLinkedList list2=new SingleLinkedList();
	SingleLinkedList list3=new SingleLinkedList();
	SingleLinkedList list4=new SingleLinkedList();
	class polynomial{
		Integer coeff,exponent;
		polynomial (Integer coeff,Integer exponent){
			this.coeff=coeff;this.exponent=exponent;
		}
	}
	public void FromArrayToList(char poly,int [][]terms) {
	  switch(poly) {
		case 'A':
			for(int i=0;i<terms.length;i++) {
				polynomial x=new polynomial(terms[i][0],terms[i][1]);
			list1.add(x);
			}break;
		case 'B':
			for(int i=0;i<terms.length;i++) {
				polynomial x=new polynomial(terms[i][0],terms[i][1]);
			list2.add(x);
			}break;
		case 'C':
			for(int i=0;i<terms.length;i++) {
				polynomial x=new polynomial(terms[i][0],terms[i][1]);
			list3.add(x);
			}break;}}
	public int [][] FromListToArray(char poly){
		switch(poly) {
		case 'A':
			SingleLinkedNode n1=list1.head;
			int [][]terms1=new int [list1.size()][2];int i1=0;
			while(n1!=null){
			polynomial x=(polynomial)n1.data;
			terms1[i1][0]=x.coeff;terms1[i1][1]=x.exponent;n1=n1.next;i1++;}
			return terms1;
		case 'B':
			SingleLinkedNode n2=list2.head;
			int [][]terms2=new int [list2.size()][2];int i2=0;
			while(n2!=null){
			polynomial x=(polynomial)n2.data;
			terms2[i2][0]=x.coeff;terms2[i2][1]=x.exponent;n2=n2.next;i2++;}
			return terms2;
		case 'C':
			SingleLinkedNode n3=list3.head;
			int [][]terms3=new int [list3.size()][2];int i3=0;
			while(n3!=null){
			polynomial x=(polynomial)n3.data;
			terms3[i3][0]=x.coeff;terms3[i3][1]=x.exponent;n3=n3.next;i3++;}
			return terms3;
		case 'R':
			SingleLinkedNode n4=list4.head;
			int [][]terms4=new int [list4.size()][2];int i4=0;
			while(n4!=null){
			polynomial x=(polynomial)n4.data;
			terms4[i4][0]=x.coeff;terms4[i4][1]=x.exponent;n4=n4.next;i4++;}
			return terms4;
		}return null;
	}
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
	   	FromArrayToList('A',terms);break;
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
		    FromArrayToList('B',terms);break;
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
		   	FromArrayToList('C',terms);break;
		}
	}
	public String print(char poly) {
		switch(poly) {
		case 'A':
			try {
				int i=0;
				int [][]terms=FromListToArray('A');
				while(i<terms.length-1) {
					if(terms[i][0]==0) i++;
					else if(terms[i][1]==0) {
						System.out.printf("%s",terms[i][0]+"");
						if(terms[i+1][0]>0) System.out.printf(" +");
						else i++;
					}
					else if(terms[i][0]==1&&terms[i][1]!=0) {
						if(terms[i+1][0]>0) {System.out.printf(" +");i++;}
						if(terms[i+1][0]>0) System.out.printf(" +");
						else i++;
					}
					else if(terms[i][0]==-1&&terms[i][1]!=0) {
						if(terms[i+1][0]>0) {System.out.printf(" +");i++;}
						if(terms[i+1][0]>0) System.out.printf(" +");
						else i++;
					}
					else {
						System.out.printf("%s",terms[i][0]+"x^"+terms[i][1]+"");
						if(terms[i+1][0]>0) { System.out.printf(" +");i++;}
						else i++;
					}
				}
				if(terms[i][0]==0) i++;
				else if(terms[i][1]==0) 
					System.out.printf("%s",terms[i][0]+"");
				else if(terms[i][0]==1&&terms[i][1]!=0) 
					System.out.printf("%s","x^"+terms[i][1]+"");
				else if(terms[i][0]==-1&&terms[i][1]!=0)
					System.out.printf("%s","-"+"x^"+terms[i][1]+"");
				else 
					System.out.printf("%s",terms[i][0]+"x^"+terms[i][1]+"");
				} catch (Exception e) {
				System.out.println("polynomial A is not set");break;
			}
			System.out.println("\nPolynomial A is set");break;
			case 'B':
				try {
					int i=0;
					int [][]terms=FromListToArray('B');
					while(i<terms.length-1) {
						if(terms[i][0]==0) i++;
						else if(terms[i][1]==0) {
							System.out.printf("%s",terms[i][0]+"");
							if(terms[i+1][0]>0) System.out.printf(" +");
							else i++;
						}
						else if(terms[i][0]==1&&terms[i][1]!=0) {
							if(terms[i+1][0]>0) {System.out.printf(" +");i++;}
							if(terms[i+1][0]>0) System.out.printf(" +");
							else i++;
						}
						else if(terms[i][0]==-1&&terms[i][1]!=0) {
							if(terms[i+1][0]>0) {System.out.printf(" +");i++;}
							if(terms[i+1][0]>0) System.out.printf(" +");
							else i++;
						}
						else {
							System.out.printf("%s",terms[i][0]+"x^"+terms[i][1]+"");
							if(terms[i+1][0]>0) { System.out.printf(" +");i++;}
							else i++;
						}
					}
					if(terms[i][0]==0) i++;
					else if(terms[i][1]==0) 
						System.out.printf("%s",terms[i][0]+"");
					else if(terms[i][0]==1&&terms[i][1]!=0) 
						System.out.printf("%s","x^"+terms[i][1]+"");
					else if(terms[i][0]==-1&&terms[i][1]!=0)
						System.out.printf("%s","-"+"x^"+terms[i][1]+"");
					else 
						System.out.printf("%s",terms[i][0]+"x^"+terms[i][1]+"");
					} catch (Exception e) {
					System.out.println("polynomial B is not set");break;
				}
				System.out.println("\nPolynomial B is set");break;
		case 'C':
			try {
				int i=0;
				int [][]terms=FromListToArray('C');
				while(i<terms.length-1) {
					if(terms[i][0]==0) i++;
					else if(terms[i][1]==0) {
						System.out.printf("%s",terms[i][0]+"");
						if(terms[i+1][0]>0) System.out.printf(" +");
						else i++;
					}
					else if(terms[i][0]==1&&terms[i][1]!=0) {
						if(terms[i+1][0]>0) {System.out.printf(" +");i++;}
						if(terms[i+1][0]>0) System.out.printf(" +");
						else i++;
					}
					else if(terms[i][0]==-1&&terms[i][1]!=0) {
						if(terms[i+1][0]>0) {System.out.printf(" +");i++;}
						if(terms[i+1][0]>0) System.out.printf(" +");
						else i++;
					}
					else {
						System.out.printf("%s",terms[i][0]+"x^"+terms[i][1]+"");
						if(terms[i+1][0]>0) { System.out.printf(" +");i++;}
						else i++;
					}
				}
				if(terms[i][0]==0) i++;
				else if(terms[i][1]==0) 
					System.out.printf("%s",terms[i][0]+"");
				else if(terms[i][0]==1&&terms[i][1]!=0) 
					System.out.printf("%s","x^"+terms[i][1]+"");
				else if(terms[i][0]==-1&&terms[i][1]!=0)
					System.out.printf("%s","-"+"x^"+terms[i][1]+"");
				else 
					System.out.printf("%s",terms[i][0]+"x^"+terms[i][1]+"");
				} catch (Exception e) {
				System.out.println("polynomial C is not set");break;
			}
			System.out.println("\nPolynomial C is set");break;
		case 'R':
			try {
				int i=0;
				int [][]terms=FromListToArray('R');
				while(i<terms.length-1) {
					if(terms[i][0]==0) i++;
					else if(terms[i][1]==0) {
						System.out.printf("%s",terms[i][0]+"");
						if(terms[i+1][0]>0) System.out.printf(" +");
						else i++;
					}
					else if(terms[i][0]==1&&terms[i][1]!=0) {
						if(terms[i+1][0]>0) {System.out.printf(" +");i++;}
						if(terms[i+1][0]>0) System.out.printf(" +");
						else i++;
					}
					else if(terms[i][0]==-1&&terms[i][1]!=0) {
						if(terms[i+1][0]>0) {System.out.printf(" +");i++;}
						if(terms[i+1][0]>0) System.out.printf(" +");
						else i++;
					}
					else {
						System.out.printf("%s",terms[i][0]+"x^"+terms[i][1]+"");
						if(terms[i+1][0]>0) { System.out.printf(" +");i++;}
						else i++;
					}
				}
				if(terms[i][0]==0) i++;
				else if(terms[i][1]==0) 
					System.out.printf("%s",terms[i][0]+"");
				else if(terms[i][0]==1&&terms[i][1]!=0) 
					System.out.printf("%s","x^"+terms[i][1]+"");
				else if(terms[i][0]==-1&&terms[i][1]!=0)
					System.out.printf("%s","-"+"x^"+terms[i][1]+"");
				else 
					System.out.printf("%s",terms[i][0]+"x^"+terms[i][1]+"");
				} catch (Exception e) {
				System.out.println("polynomial R is not set");break;
			}
			System.out.println("\nPolynomial R is set");break;
		}return null;
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
	public float evaluatePolynomial(char poly, float value) {
		float a=0;
	switch(poly) {
	case 'A':
		int terms1[][]=FromListToArray('A');
		for(int i=0;i<terms1.length;i++) {
			a+=terms1[i][0]*Math.pow(value,terms1[i][1]);
		}break;
	case 'B':
		int terms2[][]=FromListToArray('B');
		for(int i=0;i<terms2.length;i++) {
			a+=terms2[i][0]*Math.pow(value,terms2[i][1]);
		}break;
	case 'C':
		int [][]terms3=FromListToArray('C');
		for(int i=0;i<terms3.length;i++) {
			a+=terms3[i][0]*Math.pow(value,terms3[i][1]);
		}break;
	case 'R':
		int terms4[][]=FromListToArray('A');
		for(int i=0;i<terms4.length;i++) {
			a+=terms4[i][0]*Math.pow(value,terms4[i][1]);
		}break;
	}return a;
    }
	public int [][]add(char poly1,char poly2){
		switch(poly1&poly2) {
		case 'A'&'B':
			int [][]terms1=FromListToArray('A');int [][]terms2=FromListToArray('B');
			int i=0,j=0;
		while(i<terms1.length&&j<terms2.length) {
				if(terms1[i][1]>terms2[i][1]) { 
					list4.add(new polynomial(terms1[i][0],terms1[i][1]));i++;}
				else if(terms1[i][1]<terms2[i][1]) {
					list4.add(new polynomial(terms2[j][0],terms2[j][1]));j++;}
				else {
					int l=terms1[i][0]+terms2[i][0];
					list4.add(new polynomial(l,terms1[i][1]));i++;j++;}
			}
			while(i==terms1.length&&j<terms2.length) {
				list4.add(new polynomial(terms2[j][0],terms2[j][1]));j++;}
			while(i<terms1.length&&j==terms2.length) {
				list4.add(new polynomial(terms1[i][0],terms1[i][1]));i++;}
			break;
			case 'B'&'C':
				terms1=FromListToArray('B');terms2=FromListToArray('C');
				i=0;j=0;
			while(i<terms1.length&&j<terms2.length) {
					if(terms1[i][1]>terms2[i][1]) { 
						list4.add(new polynomial(terms1[i][0],terms1[i][1]));i++;}
					else if(terms1[i][1]<terms2[i][1]) {
						list4.add(new polynomial(terms2[j][0],terms2[j][1]));j++;}
					else {
						int l=terms1[i][0]+terms2[i][0];
						list4.add(new polynomial(l,terms1[i][1]));i++;j++;}
				}
				while(i==terms1.length&&j<terms2.length) {
					list4.add(new polynomial(terms2[j][0],terms2[j][1]));j++;}
				while(i<terms1.length&&j==terms2.length) {
					list4.add(new polynomial(terms1[i][0],terms1[i][1]));i++;}
				break;
		case 'A'&'C':
			terms1=FromListToArray('A');terms2=FromListToArray('C');
			i=0;j=0;
		while(i<terms1.length&&j<terms2.length) {
				if(terms1[i][1]>terms2[i][1]) { 
					list4.add(new polynomial(terms1[i][0],terms1[i][1]));i++;}
				else if(terms1[i][1]<terms2[i][1]) {
					list4.add(new polynomial(terms2[j][0],terms2[j][1]));j++;}
				else {
					int l=terms1[i][0]+terms2[i][0];
					list4.add(new polynomial(l,terms1[i][1]));i++;j++;}
			}
			while(i==terms1.length&&j<terms2.length) {
				list4.add(new polynomial(terms2[j][0],terms2[j][1]));j++;}
			while(i<terms1.length&&j==terms2.length) {
				list4.add(new polynomial(terms1[i][0],terms1[i][1]));i++;}
			break;
		}
		return null;
	}
	public int [][]subtract(char poly1,char poly2){
		switch(poly1&poly2) {
		case 'A'&'B':
			int [][]terms1=FromListToArray('A');int [][]terms2=FromListToArray('C');
			int i=0,j=0;
		while(i<terms1.length&&j<terms2.length) {
				if(terms1[i][1]>terms2[i][1]) { 
					list4.add(new polynomial(terms1[i][0],terms1[i][1]));i++;}
				else if(terms1[i][1]<terms2[i][1]) {
					list4.add(new polynomial(terms2[j][0],terms2[j][1]));j++;}
				else {
					if(poly1=='A'&&poly2=='C') {
						int l=terms1[i][0]-terms2[i][0];
						list4.add(new polynomial(l,terms1[i][1]));i++;j++;}
						else {
							int l=terms2[i][0]-terms1[i][0];
							list4.add(new polynomial(l,terms1[i][1]));i++;j++;}
				}
			}
			while(i==terms1.length&&j<terms2.length) {
				list4.add(new polynomial(terms2[j][0],terms2[j][1]));j++;}
			while(i<terms1.length&&j==terms2.length) {
				list4.add(new polynomial(terms1[i][0],terms1[i][1]));i++;}
			break;
			case 'B'&'C':
				terms1=FromListToArray('B');terms2=FromListToArray('C');
				i=0;j=0;
			while(i<terms1.length&&j<terms2.length) {
					if(terms1[i][1]>terms2[i][1]) { 
						list4.add(new polynomial(terms1[i][0],terms1[i][1]));i++;}
					else if(terms1[i][1]<terms2[i][1]) {
						list4.add(new polynomial(terms2[j][0],terms2[j][1]));j++;}
					else {
						if(poly1=='A'&&poly2=='C') {
							int l=terms1[i][0]-terms2[i][0];
							list4.add(new polynomial(l,terms1[i][1]));i++;j++;}
							else {
								int l=terms2[i][0]-terms1[i][0];
								list4.add(new polynomial(l,terms1[i][1]));i++;j++;}
					}
				}
				while(i==terms1.length&&j<terms2.length) {
					list4.add(new polynomial(terms2[j][0],terms2[j][1]));j++;}
				while(i<terms1.length&&j==terms2.length) {
					list4.add(new polynomial(terms1[i][0],terms1[i][1]));i++;}
				break;
		case 'A'&'C':
			terms1=FromListToArray('A');terms2=FromListToArray('C');
			i=0;j=0;
		while(i<terms1.length&&j<terms2.length) {
				if(terms1[i][1]>terms2[i][1]) { 
					list4.add(new polynomial(terms1[i][0],terms1[i][1]));i++;}
				else if(terms1[i][1]<terms2[i][1]) {
					list4.add(new polynomial(terms2[j][0],terms2[j][1]));j++;}
				else {
					if(poly1=='A'&&poly2=='C') {
						int l=terms1[i][0]-terms2[i][0];
						list4.add(new polynomial(l,terms1[i][1]));i++;j++;}
						else {
							int l=terms2[i][0]-terms1[i][0];
							list4.add(new polynomial(l,terms1[i][1]));i++;j++;}
				}
			}
			while(i==terms1.length&&j<terms2.length) {
				list4.add(new polynomial(terms2[j][0],terms2[j][1]));j++;}
			while(i<terms1.length&&j==terms2.length) {
				list4.add(new polynomial(terms1[i][0],terms1[i][1]));i++;}
			break;
		}
		return null;}
    public int [][] multiply(char poly1,char poly2){
    	switch(poly1&poly2) {
    	case 'A'&'B':
    		int [][]terms1=FromListToArray('A');int [][]terms2=FromListToArray('B');
    		int [][]terms3=new int [terms1.length*terms2.length][2];int n=0,l=0;
    		for(int i=0;i<terms1.length;i++) {
    			for(int j=0;j<terms2.length;j++) {
    				terms3[n][0]=terms1[i][0]*terms2[j][0];
    				terms3[n][1]=terms1[i][1]+terms2[j][1];n++;
    			}
    		}
    		for(int i=0;i<n;i++) {
    			for(int j=i+1;j<n;j++) {
    				if(terms3[i][1]==terms3[j][1]) {
    					l+=terms3[i][0]+terms3[j][0];terms3[i][0]=l;
    					for(int k=j;k<n-1;k++) {
    						for(int m=0;m<2;m++) {
    						int temp=terms3[k][m];
    						terms3[k][m]=terms3[k+1][m];
    						terms3[k+1][m]=temp;
    						}
    					}
    					terms3[n-1][0]=0;terms3[n-1][1]=0;n--;
    				}
    			}
    		}
    		for(int i=0;i<n;i++) list4.add(new polynomial(terms3[i][0],terms3[i][1]));break;
        case 'B'&'C':
        	terms1=FromListToArray('B');terms2=FromListToArray('C');
    		terms3=new int [terms1.length*terms2.length][2];n=0;l=0;
    		for(int i=0;i<terms1.length;i++) {
    			for(int j=0;j<terms2.length;j++) {
    				terms3[n][0]=terms1[i][0]*terms2[j][0];
    				terms3[n][1]=terms1[i][1]+terms2[j][1];n++;
    			}
    		}
    		for(int i=0;i<n;i++) {
    			for(int j=i+1;j<n;j++) {
    				if(terms3[i][1]==terms3[j][1]) {
    					l+=terms3[i][0]+terms3[j][0];terms3[i][0]=l;
    					for(int k=j;k<n-1;k++) {
    						for(int m=0;m<2;m++) {
    						int temp=terms3[k][m];
    						terms3[k][m]=terms3[k+1][m];
    						terms3[k+1][m]=temp;
    						}
    					}
    					terms3[n-1][0]=0;terms3[n-1][1]=0;n--;
    				}
    			}
    		}
    		for(int i=0;i<n;i++) list4.add(new polynomial(terms3[i][0],terms3[i][1]));break;
    	case 'A'&'C':
    		terms1=FromListToArray('A');terms2=FromListToArray('C');
    		terms3=new int [terms1.length*terms2.length][2];n=0;l=0;
    		for(int i=0;i<terms1.length;i++) {
    			for(int j=0;j<terms2.length;j++) {
    				terms3[n][0]=terms1[i][0]*terms2[j][0];
    				terms3[n][1]=terms1[i][1]+terms2[j][1];n++;
    			}
    		}
    		for(int i=0;i<n;i++) {
    			for(int j=i+1;j<n;j++) {
    				if(terms3[i][1]==terms3[j][1]) {
    					l+=terms3[i][0]+terms3[j][0];terms3[i][0]=l;
    					for(int k=j;k<n-1;k++) {
    						for(int m=0;m<2;m++) {
    						int temp=terms3[k][m];
    						terms3[k][m]=terms3[k+1][m];
    						terms3[k+1][m]=temp;
    						}
    					}
    					terms3[n-1][0]=0;terms3[n-1][1]=0;n--;
    				}
    			}
    		}
    		for(int i=0;i<n;i++) list4.add(new polynomial(terms3[i][0],terms3[i][1]));break;
    	}return null;
    }
}