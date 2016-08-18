package demo;

public class TestRecursion {

	public static int test01(int i) {
		return i == 1 || i == 2 ? 1 : test01(i - 1) + test01(i - 2);
	}

	public static int test02(int j) {
		return j == 1 ? 1 : j * test02(j-1);
	}

	public static void main(String[] args) {
		System.out.println(test02(10));
		System.out.println(test01(10));
	}
}
