public class TestCase {
	public TestCase(Function f) {
		NewtonRaphson nr = new NewtonRaphson();
		//System.out.println(f.evaluate(2));
		//System.out.println(f.evaluate(3));
		//System.out.println(nr.findRoot(f, 3));
		for (int i = 0; i < f.getDegree(); ++i) {
			System.out.println(f.getCoef(i));
		}
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		while (true) {
			TestCase t = new TestCase(new Function(sc.next()));
		}
	}

}
