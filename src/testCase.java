import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testCase {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testsub() {
		
assertEquals("error",2.0,CalculatorModel.subTwoNumbers(6.0, 4.0),0.0);


	}
	@Test
	public void testAdd(){
		assertEquals("error",10.0,CalculatorModel.addTwoNumbers(5.0, 5.0),0.0);
	}
@Test
public void testMul(){
	assertEquals("error",4.0,CalculatorModel.multTwoNumbers(2.0, 2.0),0.0);
	
}
@Test
public void testDiv(){
	//assertEquals("error",2.0,CalculatorModel.divTwoNumbers(8.0, 4.0),0.0);
	//assertEquals("error",2.0,CalculatorModel.divTwoNumbers(8.0, 0.0),0.0);
	
}
@Test
public void testMod(){
	assertEquals("error",2.0,CalculatorModel.modTwoNumbers(6.0, 4.0),0.0);

}
@Test
public void testSqrt(){
	assertEquals("error",3.0,CalculatorModel.sqr(9.0),0.0);
}
}
