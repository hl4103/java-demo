package demo;

public class TestWhile {
	public static void main(String[] args) {
		int a = 1;
		while (a <= 100) {
			System.out.println(a);
			a++;
		}

		int b = 1;
		int total = 0;
		while (b <= 100) {
			total += b;
			b++;
		}
		System.out.println(total);

		int c = 1;
		int sum = 0;
		do {
			sum += c;
			c++;
		} while (c <= 100);
		
		System.out.println(sum);
	}
}
