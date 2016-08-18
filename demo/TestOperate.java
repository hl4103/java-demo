package demo;

public class TestOperate {

	public static void main(String[] args) {
		int m = 8;
		int n = 4;
		System.out.println(m | n);
		System.out.println(m & n);
		System.out.println(m ^ n);
		System.out.println(~m);

		int a = 3 * 2 * 2;
		int b = 3 << 2;
		int c = 12 / 2 / 2;
		int d = 12 >> 2;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		boolean e = true & false;
		System.out.println(e);

		String str = "5";
		int s = 4;
		System.out.println(str + s);
	}
}
