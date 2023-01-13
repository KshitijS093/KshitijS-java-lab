import java.util.*;
class FatherAgeException extends Exception
{
	public String toString()
	{
		return(" Father's Age cannot be negative");
	} 
}
class SonnAgeException extends Exception
{
	public String toString()
	{
		return(" Son's Age cannot be negative");
	} 
}
class SonAgeException extends Exception
{
	public String toString()
	{
		return(" Son's age is more than father's age");
	} 
}

class Father
{
	int age;
	Father(int age)
	{
		this.age = age;
	}
	void ThrowingFather()
	{
		try
 		{
			if(age < 0)
			{
				throw new FatherAgeException();
			}
		}
		catch (FatherAgeException e)
		{
			System.out.println(e);
		}
	}

	
}


class Son extends Father
{	
	int sage;
	Son(int fage,int sage)
	{
	    super(fage);
		this.sage = sage;
		
	}
	void ThrowSon()
	{
		try
 		{
			if(sage < 0)
			{
				throw new SonnAgeException();
			}
		}
		catch (SonnAgeException e)
		{
			System.out.println(e);
		}
	}
	void ThrowingSon()
	{
		try
		{
			if(sage > age)
			{
				throw new SonAgeException();
			}
		}
		catch (SonAgeException e)
		{
			System.out.println(e);
		}
	}
	
}





class Main
{
	public static void main(String args[])
	{
	    int fatage,Sonage;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fathers age");
		fatage = sc.nextInt();
		System.out.println("Enter Son's age");
		Sonage = sc.nextInt();
		Son s = new Son(fatage,Sonage);
		s.ThrowingFather();
		s.ThrowSon();
		s.ThrowingSon();
	}
}