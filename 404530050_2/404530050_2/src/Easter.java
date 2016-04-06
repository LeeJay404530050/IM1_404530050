
public class Easter {
	public static String calculateEaster(int aYear) {
		int year, month, day;
		double a, b, c, k, p, q, M, N, d, e;
		year = aYear;
		a = aYear % 19;
		b = aYear % 4;
		c = aYear % 7;
		k = Math.floor(aYear / 100);
		p = Math.floor((13 + (8 * k)) / 25);
		q = Math.floor(k / 4);
		M = (15 - p + k - q) % 30;
		N = (4 + k - q) % 7;
		d = (19 * a + M) % 30;
		e = (2 * b + 4 * c + 6 * d + N) % 7;
		if (d + e < 10) {
			month = 3;
			day = (int) (d + e + 22);
		} else {
			month = 4;
			day = (int) (d + e - 9);
		}
		if (month == 4 && day == 26) {
			day = 19;
		}
		// day=d+e-9, 所以第三個第四個判斷其實是多餘的喔! a > 10? -2
		if (month == 4 && day == 25 && d == 28 && e == 6 && a > 10) {
			day = 18;
		}
		return "In" + year + ", Easter Sunday is: month = " + month + " , and date is " + day;
	}
}
