class ThrowDemo
{
	public static void main(String args[])
	{
		int a;
		a = args.length;
		if(a==1)
		{
			try
			{
				throw new NullPointerException(args[0]);
			}
			
		}
		else if(a==2)
		{
			try
			{
				throw new ArithmeticException(args[1]);
			}
				
		}
		else
		{
			System.out.println("Normal Execution");
		}
		catch(NullPointerException e)
		{
			System.out.println("Error" + e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error" + e);
		}
	}
}