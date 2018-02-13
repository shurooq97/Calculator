

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testCase {
private CalculatorModel model;
private CalculatorView view;
@Before
public void befor() {
	model = new CalculatorModel();
	view= new CalculatorView();
	
}

@java.lang.Deprecated
	@SuppressWarnings("deprecation")
	@Test
	public void testaddition() {
	double delta = 0;
	model.addTwoNumbers(0.0, 1.0);
		assertEquals( 1.0,model.getCalculationValue(),delta);
		model.addTwoNumbers(-2.0, 5.0);
		assertEquals( 3.0,model.getCalculationValue(),delta);
		model.addTwoNumbers(5.0, 5);
		assertEquals( 10.0,model.getCalculationValue(),delta);
	}
@Test
public void testsub() {
double delta = 0;
model.subTwoNumbers(0.0, 1.0);
	assertEquals( -1.0,model.getCalculationValue(),delta);
	model.subTwoNumbers(-2.0, 5.0);
	assertEquals( -7.0,model.getCalculationValue(),delta);
	model.subTwoNumbers(5.0, 5);
	assertEquals( 0.0,model.getCalculationValue(),delta);
}
@Test
public void tesmul() {
double delta = 0;
model.multTwoNumbers(0.0, 1.0);
	assertEquals( 0.0,model.getCalculationValue(),delta);
	model.multTwoNumbers(-2.0, 5.0);
	assertEquals( -10.0,model.getCalculationValue(),delta);
	model.multTwoNumbers(5.0, 5);
	assertEquals( 25.0,model.getCalculationValue(),delta);
}
@Test
public void testdiv() {
double delta = 0;
model.divTwoNumbers(0.0, 0.0);
assertEquals(  Double.POSITIVE_INFINITY-Double.POSITIVE_INFINITY,model.getCalculationValue(),delta);
model.divTwoNumbers(0.0, 1.0);
	assertEquals(0.0,model.getCalculationValue(),delta);
	model.divTwoNumbers(-5.0, 5.0);
	assertEquals( -1.0,model.getCalculationValue(),delta);
	model.divTwoNumbers(10, 0);
	assertEquals( Double.POSITIVE_INFINITY,model.getCalculationValue(),delta);
}
@Test
public void testmod() {
double delta = 0;
model.modTwoNumbers(8.0, 3.0);
	assertEquals(2.0,model.getCalculationValue(),delta);
	model.modTwoNumbers(5, 11);
	assertEquals( 5.0,model.getCalculationValue(),delta);
	model.modTwoNumbers(0.0, 10.0);
	assertEquals( 0.0,model.getCalculationValue(),delta);
}
@Test
public void testsqr() {
double delta = 0;
model.sqr(9.0);
	assertEquals(3.0,model.getCalculationValue(),delta);
	model.sqr(25);
	assertEquals( 5.0,model.getCalculationValue(),delta);
	model.sqr(-25);
	assertEquals( Double.POSITIVE_INFINITY-Double.POSITIVE_INFINITY,model.getCalculationValue(),delta);
}

}
