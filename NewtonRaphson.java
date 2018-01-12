public class NewtonRaphson {
	public NewtonRaphson() {
		d = new Derivative();
	}

	public double findRoot(Function f, double startingpoint) {
		Function deriv = d.findDerivative(f);
		double x1 = startingpoint - (f.evaluate(startingpoint) / deriv.evaluate(startingpoint));
		if (Math.abs(x1 - startingpoint) < 0.009) {
			return x1;
		}
		return findRoot(f, x1);
	}

	private Derivative d;
}
