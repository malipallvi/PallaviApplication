package constuctor;

public class Sample3 {
	
	int num1;
	int num2;
	
	
	//user define constructor----provided by user
	//use1---use to initialize global variable
	//use2--copy/load all the members of the class into object
	
	public void m1() {
		num1=30;
		num2=50;
	}
	
	public void add() {
		System.out.println(num1+num2);
	}
	
public void mul() {
	System.out.println(num1*num2);
}

public static void main(String[] args) {
	Sample3 s3 =new Sample3();
	s3.m1();
    s3.add();
	s3.mul();
}

}
