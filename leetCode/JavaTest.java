package Testhere;

public  class JavaTest
{
	public class B
	{
		public void f1()
		{
			System.out.println("Main class");
		}
	}
	public  class A  extends B
	{
		public void f2 ()
		{
			System.out.println("Sub class");
		}
	}

	public static void main(String[] args)
	{
		B i;
		A s;
		//s = new A();
		//i = s;

	}

}