public class Derivative {
	public Function findDerivative(Function f) {
		int[] d = new int[f.getDegree() - 1];

		for (int i = 0; i < f.getDegree() - 1; ++i) {
			d[i] = (f.getCoef(i)) * (f.getDegree() - i - 1);
		}

		return new Function(d);
	}
}
