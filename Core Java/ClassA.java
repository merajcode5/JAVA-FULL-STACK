public class ClassA
{
	public void msg()
	{
		System.out.println("It is raining outside");
		System.out.println("Even though we are enjoying JAVA");
	}
	public void display()
	{
		System.out.println("JAVA is Awesome");
	}
	public static void main(String []args)
	{
		System.out.println("Good Morning");
		ClassA aobj=new ClassA();
		aobj.msg();
		aobj.display();
	}
}