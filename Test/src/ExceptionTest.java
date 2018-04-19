class ExceptionTest{
	
	public static void main(String args[])
	{
		try
		{
			m();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("Hello");
		}
		System.out.println("Hi");

		
	}
	
	public static void m() 
	{
		int a = 10/0;
	}
}