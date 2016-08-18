package com.hlql.innerClass;

//import com.hlql.innerClass.Face.Nose;

public class Outer {
	public static void main(String[] args){
		Face f = new Face();
//		Nose n = f.new Nose();
		Face.Nose n = f.new Nose();
		n.breath();
		Face.Ear e = new Face.Ear();
		e.listen();
	}
}


class Face{
	int type;
	String sharp = "瓜子脸";
	
	class Nose{
		String type;
		
		void breath(){
			System.out.println(Face.this.type);
			System.out.println(sharp);
			System.out.println("呼吸!");
		}
	}
	
	static class Ear{
		void listen(){
			System.out.println("我在听!");
		}
	}
}