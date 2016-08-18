package demo;

/**
 * 
 * @author tom
 *
 */
public class TestIf {
	public static void main(String[] args) {
		double d = Math.random();
		int e = 1 + (int) (d * 6);
		System.out.println(e);
		switch (e) {
		case 1:
			System.out.println('1');
			break;
		case 2:
			System.out.println('2');
			break;
		default:
			System.out.println("other");
			break;
		}
	}
}
