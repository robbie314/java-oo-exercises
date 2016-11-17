
public class Fraction {
	private int numer;
	private int denom;
	private int sum;
	private int product;
	private int reciprocal;
	private int gcd;

//	public static void main(String[] args) {
//		int numer;
//		int denom;
//		int results;
//		numer = 10;
//		denom = 5;
//		results = numer / denom;
//	}

	public Fraction(int numer, int denom) {

		this.numer = numer;
		this.denom = denom;
	}

	public Fraction(int numer) {
		this.numer = 3;
		this.denom = 1;

	}

	public Fraction product(Fraction other) {
		int newNumer = this.numer * other.getNumer();
		int newDenom = this.denom * other.getDenom();
		Fraction newFraction = new Fraction(newNumer, newDenom);
		return newFraction;
	}

	public Fraction add(Fraction other) {
		int newNumer, newDenom, gcd;
		newNumer = other.getDenom() * this.numer + this.denom * other.getNumer();
		newDenom = this.denom * other.getDenom();
		int common = gcd(newNumer, newDenom);
		return new Fraction(newNumer / common, newDenom / common);
	}

	public int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);

	}

	public Fraction add(Integer other) {
		return add(new Fraction(other));
	}

	public int getNumer() {
		return numer;
	}

	public void setNumer(int numer) {
		this.numer = numer;
	}

	public int getDenom() {
		return denom;
	}

	public void setDenom(int denom) {
		this.denom = denom;
	}

	public String toString() {
		return numer + "/" + denom;
	}

	public boolean equals(Fraction other) {
		Integer numer1 = this.numer * other.getDenom();
		Integer numer2 = this.denom * other.getNumer();
		if (numer1 == numer2)
			return true;
		else
			return false;
	}
}

/*
 * } public int getSum() { return sum; } public void setSum(int sum) { this.sum
 * = sum; } public int getProduct() { return product; } public void
 * setProduct(int product) { this.product = product; } public int
 * getReciprocal() { return reciprocal; } public void setReciprocal(int
 * reciprocal) { this.reciprocal = reciprocal; } public int getGcd() { return
 * gcd; } public void setGcd(int Gcd) { this.gcd = gcd; } }
 */
