package Lec_33;

public class Person_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Hey");
		Person k= new Person();
		k.Intro_yourself();
		Person p = new Person("Pinku", 22);
		//System.out.println(p.name);
		//System.out.println(p.age);
		p.Intro_yourself();
		p.setAge(-90);
		System.out.println(p.getAge());
		System.out.println("Hey");
		
	}

}
