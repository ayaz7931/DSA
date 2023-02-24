package Lec_6;

public class for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(byte b=0;b<=127;b++) // type casting at b=128 as -128, so infinite loop
			System.out.println(b);
	}

}
