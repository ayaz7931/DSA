package Lec_33;

public class Person {

	private int age=25;
	private String name="Kamlesh";
	public Person(String name, int age)
	{
		this.age = age;
		this.name = name;
	}
	
	public Person()
	{
		
	}
	public int getAge() {
		return age;
	}
	
	
	public void setAge(int age) throws Exception {
		if(age<0) {
			throw new Exception("bklol age -ve nahi ho skta");
		}
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void Intro_yourself()
	{
		System.out.println("My name is "+ name + " and age is "+ age);
	}
	

}
