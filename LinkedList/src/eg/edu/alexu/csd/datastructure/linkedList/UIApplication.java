package eg.edu.alexu.csd.datastructure.linkedList;
import java.util.Scanner;
public class UIApplication {
	  public static void main(String []args) {
	    	Scanner input=new Scanner(System.in);
	    	PolynomialApplication polynomial=new PolynomialApplication();
	    	while(true) {
	    	System.out.println("please choose an action:");
	    	System.out.println("1_ Set a polynomial variable");
	    	System.out.println("2_ Print the value of a polynomial variable");
	    	System.out.println("3_ Add two polynomials");
	    	System.out.println("4_ Subtract two polynomials");
	    	System.out.println("5_ Multiply two polynomials");
	    	System.out.println("6_ Evaluate a polynomial variable");
	    	System.out.println("7_ Clear a polynomial variable");
	    	int num=input.nextInt();
	    	switch (num) {
	    	case 1:
	    		System.out.println("Insert the variable name: A, B or C");
	    		char poly1=input.next().charAt(0);
	    		System.out.printf("Insert the polynomial terms in the form:\n(coeff1,exponent1),(coeff2,exponent2),...\n");
	    		String b=input.next();
	    		String []v=b.split(",");int [][]u=new int [v.length/2][2];int r=0;
	    		for(int i=0;i<v.length/2;i++) {
	    			for(int j=0;j<2;j++) {
	    				u[i][j]=Integer.parseInt(v[r].replaceAll("\\D+",""));r++;
	    			}
	    		}
	    		polynomial.setPolynomial(poly1,u);break;
	    	case 2:
	    		System.out.println("Insert the variable name: A, B, C OR R");
	    		char poly2=input.next().charAt(0);
	    		polynomial.print(poly2);break;
	    		
	    	case 3:
	    		System.out.println("Insert first operand variable name:A ,B or c");
	    		char poly3=input.next().charAt(0); 
	    		System.out.println("Insert second operand variable name:A ,B or c");
	    		char poly4=input.next().charAt(0); 
	    		polynomial.add(poly3, poly4);break;
	    	case 4:
	    		System.out.println("Insert first operand variable name:A ,B or c");
	    		char poly5=input.next().charAt(0); 
	    		System.out.println("Insert second operand variable name:A ,B or c");
	    		char poly6=input.next().charAt(0); 
	    		polynomial.subtract(poly5, poly6);break;
	    	case 5:
	    		System.out.println("Insert first operand variable name:A ,B or c");
	    		char poly7=input.next().charAt(0); 
	    		System.out.println("Insert second operand variable name:A ,B or c");
	    		char poly8=input.next().charAt(0); 
	    		polynomial.multiply(poly7, poly8);break;
	    	case 6:	
	    		System.out.println("Insert the variable name: A, B, C OR R");
	    		char poly9=input.next().charAt(0);
	    		System.out.println("Enter value you want");
	    		float value=input.nextFloat();
	    	   System.out.println("value will be:"+polynomial.evaluatePolynomial(poly9, value));break;
	    	case 7:
	    		System.out.println("Insert the variable name: A, B, C OR R");
	    		char poly10=input.next().charAt(0);
	    		polynomial.clearPolynomial(poly10);break;
	        }
	    	
	    	}
	    	
	    	}
}
