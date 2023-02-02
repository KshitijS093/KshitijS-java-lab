import java.util.*;
class Student{
	String usn;
	String name;
	int credits[] = new int[10];
	int marks[] = new int[10];
	int total_credits = 0;
	int sum = 0;
	int i;
	double SGPA;
	void initialize(String usn, String name)
	{
		this.usn = usn;
		this.name = name;
	}
	void display()
	{
		System.out.println("The name of the student is: " + name);
		System.out.println("The usn of the student is: " + usn);
	}
	 void calculate(int credits[],int marks[],int n)
	{
		for(i = 0;i<n;i++)
		{
			total_credits+=credits[i];
			if(marks[i] > 89)
			{
				sum+=credits[i]*10;
			}
			if(marks[i] > 79 && marks[i] < 90)
			{
				sum+=credits[i]*9;
			}
			if(marks[i] > 69 && marks[i] < 80)
			{
				sum+=credits[i]*8;
			}
			if(marks[i] > 59 && marks[i] < 70)
			{
				sum+=credits[i]*7;
			}
			if(marks[i] > 54 && marks[i] < 60)
			{
				sum+=credits[i]*6;
			}
			if(marks[i] > 49 && marks[i] < 55)
			{
				sum+=credits[i]*5;
			}
			if(marks[i] > 39 && marks[i] < 50)
			{
				sum+=credits[i]*4;
			}
		}
		System.out.println("Total credits in this course is " + total_credits);
		System.out.println("sum of grade points multiplied by credis is " + sum);
		SGPA = (double)sum/total_credits;
		System.out.println("SGPA is " + SGPA);
	}
}


class Main
{
	public static void main(String args[])
	{
		int i,n;
		String name,usn;
		int credits[] = new int[10];
		int marks[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		name = sc.next();
		System.out.println("Enter your USN: ");
		usn = sc.next();
		System.out.println("Enter number of courses");
		n = sc.nextInt();
		System.out.println("Enter marks");
		for(i=0;i<n;i++)
		{
			marks[i] = sc.nextInt();
		}
		System.out.println("Enter the credits");
		for(i=0;i<n;i++)
		{
			credits[i] = sc.nextInt();
		}
		Student s1 = new Student();
		s1.initialize(name,usn);
		s1.display();
		s1.calculate(credits,marks,n);
	}	
}
