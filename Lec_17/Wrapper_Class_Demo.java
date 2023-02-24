package Lec_17;

public class Wrapper_Class_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a=10;
		int a1=10;
		System.out.println(a);
		System.out.println(a1);
		int i=189;
		Integer ii=i; //AutoBoxing
		System.out.println(ii);
		System.out.println(i);
		Long l=1899l;
		long ll=l; // UnBoxing
		Integer x=19;
		Integer x1=19;
		Integer y=781;
		Integer y1=781;
		System.out.println(x==x1);
		System.out.println(y==y1);
		
	}

}
