package typesofveriable;

public class Sample1 {

	int a=10;
	
	public void m1() {
		int b=100;
		System.out.println(b);
		System.out.println(a);
	}
	
	public void m2() {
		int c=20;
		System.out.println(c);
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
	
		Sample1 s1= new Sample1();
		
		s1.m1();
		s1.m2();
	}

}
