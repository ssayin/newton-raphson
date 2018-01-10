public class TestCase {
	public TestCase(Function f) {
		f.evaluate(12);
		f.getCoef(3);
		Derivative d = new Derivative();
		d.findDerivative(f);
		NewtonRaphson nr = new NewtonRaphson();
	}

	public static void main(String[] args) {
		TestCase t = new TestCase(new Function("2323"));
	}

}
