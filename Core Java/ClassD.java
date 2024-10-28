public class ClassD
{
	void meth1()
	{
		System.out.println(10);
		ClassD aobj=new ClassD();
		aobj.meth2();
		System.out.println("Hi");
	}
	void meth2()
	{
		System.out.println(20);
		ClassD aobj=new ClassD();
		aobj.meth3();
		System.out.println("Hello");
	}
	void meth3()
	{
		System.out.println(30);
		System.out.println("Welcome");
	}
	public static void main(String []args)
	{
		System.out.println("START");
		ClassD aobj=new ClassD();
		aobj.meth1();
		System.out.println("Java is Awesome");
	}
}