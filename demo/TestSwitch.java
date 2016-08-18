package demo;

public class TestSwitch {
	public static void main(String[] args){
		String str = "千里";
		switch (str) {
		case "千里":
			System.out.println(str);
			break;

		default:
			System.out.println("hello");
			break;
		}
	}
}
