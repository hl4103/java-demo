package demo;

public class TestCharType {
	public static void main(String[] args){
		char c1 = 'a';
		int i = c1 + 2;
		char c2 = (char) i;
		System.out.println(c1);
		System.out.println(c2);
		for(int j=0;j<26;j++){
			char temp = (char) (c1 + j);
			System.out.println(temp);
		}
		
		String str = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(str);
		
		boolean bool = false;
		System.out.println(bool);
	}
}
