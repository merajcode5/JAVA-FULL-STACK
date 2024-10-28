public class Assignment1
{
	void add()
	{
		int a=10; //10
		int b=2; //2
		System.out.println(a+b); //12
	}
	void sub()
	{
		int a=10; //10
		int b=2; //2
		System.out.println(a-b); //8
	}
	void mul()
	{
		int a=10; //10
		int b=2; //2
		System.out.println(a*b); //20
	}
	void div()
	{
		int a=10; //10
		int b=2; //2
		System.out.println(a/b); //5
	}
	public static void main(String []args)
	{
		System.out.println("START");
		Assignment1 aobj=new Assignment1();
		aobj.add();
		aobj.sub();
		aobj.mul();
		aobj.div();
		System.out.println("END");
	}
}

