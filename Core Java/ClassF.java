public class ClassF
{
	void meth1(int a, int b)//a=99 b=1
	{
		System.out.println("meth1() called");
		System.out.println("a value: "+a);
		System.out.println("b value: "+b);
		System.out.println(a+b);
	}
	void meth2(int a, int b, int c)//a=10 b=20 c=30
	{
		System.out.println("meth2() called");
		System.out.println("a value: "+a);
		System.out.println("b value: "+b);
		System.out.println("c value: "+c);
		System.out.println((a+b)-c);
	}
	public static void main(String[] args)
	{
		ClassF aobj=new ClassF();
		aobj.meth1(99, 1);
		System.out.println("============================");
		aobj.meth2(10,20,30);
	}
}