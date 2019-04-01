package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	SimpleCalculator calc;
	
	@Before
	public void setUp() {
		calc = new SimpleCalculator();
	}
	
	@Test
	public void testAdd() {
		assertEquals(2,calc.add(1, 1));
	}
	@Test
	public void testMinus() {
		assertEquals(2, calc.minus(5,3));
	}
	@Test
	public void testMultiply() {
		assertEquals(12, calc.multiply(3,4));
	}
	@Test
	public void testDivide1() {
		assertTrue( calc.divide(16, 2)==8);
	}
	@Test
	public void testDivide2() {
		assertTrue(calc.divide(12, 0)==-1);
	}
	@After
	public void tearDown() {
		calc=null;
	}
}
