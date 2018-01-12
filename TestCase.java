public class TestCase {
	public TestCase(Function f) {
		int[] coefs = new int[3];
		// 2x^2 + 3x + 11
		coefs[0] = 1;
		coefs[1] = -2;
		coefs[2] = -2;
		Function fe = new Function(coefs);
		NewtonRaphson nr = new NewtonRaphson();
		System.out.println(fe.evaluate(2));
		System.out.println(fe.evaluate(3));
		System.out.println(nr.findRoot(fe, 3));
	}

	public static void main(String[] args) {
		TestCase t = new TestCase(new Function("2323"));
	}

}
