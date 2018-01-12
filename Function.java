public class Function {
	public Function(String f) {
		setCoefs(new Parser().parse(f));
	}

	public Function(int[] c) {
		setCoefs(c);
	}

	public double evaluate(double x) {
		double sum = 0;
		double temp = 1;
		for (int i = coefs.length - 1; i >= 0; --i) {
			sum += (getCoef(i) * temp);
			temp *= x;
		}

		return sum;
	}

	public int getCoef(int power) {
		return (power < coefs.length) ? coefs[power] : 0;
	}

	public void setCoefs(int[] c) {
		coefs = new int[c.length];

		for (int i = 0; i < c.length; ++i) {
			coefs[i] = c[i];
		}

		degree = coefs.length;
	}

	public int getDegree() {
		return degree;
	}

	// Private members

	private int[] coefs;
	private int degree;

}
