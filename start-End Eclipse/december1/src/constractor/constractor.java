package constractor;

public class constractor {
	
	int a;
	double b;
	String g;
	
	constractor() {
	a=32;
	b=5.5;
		
	}
	constractor(int q) {
		a=7;
	g="pravin";
	}
	private constractor(double w,String o) {
		a=5;
		b=8.9;
		
	}
	public static void main(String [] args) {
		constractor tc=new constractor();
		System.out.println(tc.a);
		
		constractor tc1=new constractor(50);
		System.out.println(tc1.a);
		
		constractor tc2=new constractor(5.5, "aws");
		System.out.println(tc2.b);
	}
}
