package eg.edu.alexu.csd.datastructure.linkedList;
import java.util.Scanner;
public class UIApplication {
	  public static void main(String []args) {
	    	PolynomialSolver s=new PolynomialSolver();
	    	while(true) {
	    	System.out.println("please choose an action:");
	    	System.out.println("1_ Set a polynomial variable");
	    	System.out.println("2_ Print the value of a polynomial variable");
	    	System.out.println("3_ Add two polynomials");
	    	System.out.println("4_ Subtract two polynomials");
	    	System.out.println("5_ Multiply two polynomials");
	    	System.out.println("6_ Evaluate a polynomial variable");
	    	System.out.println("7_ Clear a polynomial variable");
	    	Scanner input=new Scanner(System.in);
	    	int num=input.nextInt();
	    	switch (num) {
	    	case 1:
	    		System.out.println("Insert the variable name: A, B or C");
	    		char poly1=input.next().charAt(0);
	    		System.out.printf("Insert the polynomial terms in the form:\n(coeff1,exponent1),(coeff2,exponent2),...\n");
	    		Scanner o=new Scanner(System.in);
	    	    String a=o.nextLine();String []x=a.trim().split("\\s+");
	    	    String c="";for(int i=0;i<x.length;i++) {c+=x[i];}
	    	    String []v=c.split(",");int[][] u=new int[v.length/2][2];int r=0;
	    	    for(int i=0;i<v.length;i++) {v[i]=v[i].replaceAll("[()]", "");
	    	    v[i]=v[i].replaceAll("\\s+", "");}
	    	 for(int i=0;i<v.length/2;i++) {
	    	 	for(int j=0;j<2;j++) {u[i][j]=Integer.parseInt(v[r++]);	
	    	 		}}
               s.setPolynomial(poly1,u);break;
	    		case 2:
	    		System.out.println("Insert the variable name: A, B, C OR R");
	    		char poly2=input.next().charAt(0);
                if(poly2=='A') {
	    		System.out.println(s.print(poly2));System.out.println("polynomial A is set");}
                if(poly2=='B') {
    	    		System.out.println(s.print(poly2));System.out.println("polynomial B is set");}
                if(poly2=='C') {
    	    		System.out.println(s.print(poly2));System.out.println("polynomial C is set");}
                if(poly2=='R') {
    	    		System.out.println(s.print(poly2));System.out.println("polynomial R is set");}break;
	    		case 3:
	    		System.out.println("Insert first operand variable name:A ,B or c");
	    		char poly3=input.next().charAt(0); 
	    		System.out.println("Insert second operand variable name:A ,B or c");
	    		char poly4=input.next().charAt(0); 
	    		int [][]a1=s.add(poly3, poly4);String str1=new String();
	    		s.setPolynomial('R', a1);
	    		for(int i=0;i<a1.length;i++) {str1+="(";str1+=a1[i][0];str1+=",";str1+=a1[i][1];str1+=")";
	    		if(i==a1.length-1) {}
	    		else {str1+=",";}
	    		}
	    		System.out.println("Result set in R is : "+ str1);
	    		break;
	    	case 4:
	    		System.out.println("Insert first operand variable name:A ,B or c");
	    		char poly5=input.next().charAt(0); 
	    		System.out.println("Insert second operand variable name:A ,B or c");
	    		char poly6=input.next().charAt(0); 
	    		int [][]a2=s.subtract(poly5, poly6);String str2=new String();
	    		s.setPolynomial('R', a2);
	    		for(int i=0;i<a2.length;i++) {str2+="(";str2+=a2[i][0];str2+=",";str2+=a2[i][1];str2+=")";
	    		if(i==a2.length-1) {}
	    		else {str2+=",";}
	    		}
	    		System.out.println("Result set in R is : "+ str2);break;
	    	case 5:
	    		System.out.println("Insert first operand variable name:A ,B or c");
	    		char poly7=input.next().charAt(0); 
	    		System.out.println("Insert second operand variable name:A ,B or c");
	    		char poly8=input.next().charAt(0); 
	    		int [][]a3=s.multiply(poly7, poly8);String str3=new String();
	    		s.setPolynomial('R', a3);
	    		for(int i=0;i<a3.length;i++) {str3+="(";str3+=a3[i][0];str3+=",";str3+=a3[i][1];str3+=")";
	    		if(i==a3.length-1) {}
	    		else {str3+=",";}
	    		}
	    		System.out.println("Result set in R is : "+ str3);break;
	    	case 6:	
	    		System.out.println("Insert the variable name: A, B, C OR R");
	    		char poly9=input.next().charAt(0);
	    		System.out.println("Enter value you want");
	    		float value=input.nextFloat();
	    	    System.out.println(s.evaluatePolynomial(poly9, value));break;
	    	case 7:
	    		System.out.println("Insert the variable name: A, B, C OR R");
	    		char poly10=input.next().charAt(0);
	    		s.clearPolynomial(poly10);break;
	    		
	        }
	    	
	    	}
	    	
	    	}
}