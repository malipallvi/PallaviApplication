package constuctor;

public class Sample1 {

	//default constructor ---provided by compiler
	//use--copy/load all the members of the class into object
	
//Sample1()
	//{
	//}
	

	public void m1() {
	System.out.println("running method m1");
	}

	public static void main(String[] args) {
		
	Sample1 s1= new Sample1();
	         s1.m1();
	         
	         System.out.println("-----");
	
	Sample2 s2= new Sample2();
	s2.m2();

	}
}
