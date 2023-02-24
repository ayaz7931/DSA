package Lec2;

public class Post_pre {
	public static void main(String[] args) {
		
		int a=5;
		System.out.println(a);
		System.out.println(a++);  // assigned 5 in a then increment
		System.out.println(a); // incremented value of a
		int c = a++ + a-- + 8 - a-- - a++;
		//  10 = 6 + 7 + 8 - 6 - 5;
		System.out.println(c);
		int b=15;
		System.out.println(b++); // assigned 15 in b then increment
		int d = b++ + b-- + 8 + b-- - b++ - b++;
		//  26 = 16 + 17 + 8 + 16 - 15 - 16;
		System.out.println(d);
		int e = 14;
		System.out.println(++e); // first increment then assign 15 in e
		System.out.println(e);
		int f = ++e - --e + ++e - e-- + e++ + --e;
		//  31 = 16 - 15 + 16 - 16 + 15 + 15;
		System.out.println(f);
	}

}
