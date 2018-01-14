public class Parser {
	public int[] parse(String s) {
		s = s.replace("-", "+-");
		String[] parts = s.split("\\+");

		if (s.charAt(0) == '+') {
			String[] parts2 = new String[parts.length - 1];
			for (int i = 1; i < parts.length; ++i) {
				parts2[i - 1] = parts[i];
			}
			parts = parts2;
		}

		int[] coefs;

		Parser p = extractCoef(parts[0]);
		int deg = p.exp;
		coefs = new int[deg + 1];
		coefs[0] = p.coef;

		for (int i = 1; i < parts.length; ++i) {
			p = extractCoef(parts[i]);
			coefs[deg - p.exp] = p.coef;
		}

		return coefs;
	}

	private Parser extractCoef(String s) {
		Parser p = new Parser();
		String[] parts;
		// ax^b or x^b
		if (s.indexOf('^') > -1) {
			parts = s.split("\\^");
			if (s.charAt(0) == 'x') {
				p.coef = 1;
			} else if (s.charAt(0) == '-' && s.charAt(1) == 'x') {
				p.coef = -1;
			} else {
				p.coef = Integer.parseInt(parts[0].substring(0, parts[0].length() - 1));
			}
			p.exp = Integer.parseInt(parts[1]);
		} else {
			// ax form
			if (s.charAt(s.length() - 1) == 'x') {
				p.exp = 1;
				// -x form
				if (s.charAt(0) == '-' && s.length() == 2) {
					p.exp = 1;
					p.coef = -1;
					return p;
				// x form
				} else if (s.charAt(0) == 'x') {
					p.exp = 1;
					p.coef = 1;
					return p;
				}
				s = s.substring(0, s.length() - 1);
			// a form
			} else {
				p.exp = 0;
			}

			p.coef = Integer.parseInt(s);
		}

		return p;
	}

	private int exp;
	private int coef;
}
