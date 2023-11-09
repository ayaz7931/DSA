package Lec_33;

public class Student {

	
	String name;
	int age;
	public void Intro_yourself()
	{
		System.out.println("My name is " + name + " and my age is " + age);
	}
	public void SayHey(String name)
	{
		System.out.println(name + " Say Hey to " + this.name);
	}
	public static void Fun()
	{
		System.out.println("I am having fun");
	}
	static
	{
		System.out.println("Hey all, Welcome to Coding Blocks");
	}

}
