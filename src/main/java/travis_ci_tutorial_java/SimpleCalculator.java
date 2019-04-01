package travis_ci_tutorial_java;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}
	public int minus(int a, int b) {
		return a-b;
	}
	public int multiply(int a, int b) {
		return a*b;
	}

	public float divide(int a, int b) {
		if (b == 0) {
			System.out.println("Can't divide by zero");
			return -1;
		} else {
			return (float) a / b;
		}
	}
}