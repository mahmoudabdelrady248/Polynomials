package eg.edu.alexu.csd.datastructure.linkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PolynomialTest {

	@Test
	void test() {
		PolynomialSolver test=new PolynomialSolver();
		int [][] polyA=new int[][]{{4,5},{-8,-9},{7,1},{0,0}};
		int [][] polyB=new int[][]{{1,1},{2,2},{3,3}};
		int [][] polyC=new int[][]{{-1,-2},{5,6}};
		test.setPolynomial('A',polyA);
		test.setPolynomial('B',polyB);
		test.setPolynomial('C',polyC);
		String PolyA="4x^5+7x-8x^-9";
	    String PolyB="3x^3+2x^2+x";
	    String PolyC="5x^6-x^-2";
	    assertEquals(PolyA,test.print('A'));
	    assertEquals(PolyB,test.print('B'));
	    assertEquals(PolyC,test.print('C'));
	    test.clearPolynomial('A');test.clearPolynomial('B');test.clearPolynomial('C');
	    assertEquals(null,test.print('A'));
	    assertEquals(null,test.print('B'));
	    assertEquals(null,test.print('C'));
	   }

}
