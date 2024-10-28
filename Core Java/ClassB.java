public class ClassB
{
	public void add()
	{
		System.out.println("Welcome!!!");
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("c"); //c
		System.out.println(c); //30
		System.out.println("Addition Result: "+c); //Addition Result : 30
		System.out.println(99+1); //100
	}
	public static void main(String []args)
	{
		System.out.println("Start");
		ClassB aobj=new ClassB();
		aobj.add();
		System.out.println("END");
	}
}
