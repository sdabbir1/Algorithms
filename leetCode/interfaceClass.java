package Testhere;

public class interfaceClass implements TestInterface {

	/**
	 * @param args
	 */
	static int i;
	public int add(int k)
	{
		return i = k+5;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TestInterface t = (TestInterface) new interfaceClass();
		((interfaceClass) t).add(2);
		System.out.println(i);
	}
	public void sub(int i, int j) {
		// TODO Auto-generated method stub
		i = i-j;
		
	}

}
