package demo;

public class TestFor {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);

		int total = 0;
		for (int j = 1; j <= 100; j += 2) {
			total += j;
		}
		System.out.println(total);

		int total2 = 0;
		int a = 1;
		while (a <= 100) {
			total2 += a;
			a += 2;
		}
		System.out.println(total2);

		// int c = 0;
		for (int b = 1; b <= 1000; b++) {
			if (b % 5 == 0) {
				System.out.print(b + "\t");
				// c++;
				// if (c % 3 == 0) {
				// System.out.println(b);
				// } else {
				// System.out.print(b + "\t");
				// }
			}
			if (b % 15 == 0) {
				System.out.println();
			}
		}
	}
}
