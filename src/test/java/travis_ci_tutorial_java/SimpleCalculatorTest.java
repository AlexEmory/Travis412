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
	@After
	public void tearDown() {
		calc=null;
	}
}
