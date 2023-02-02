import java.util.*;
abstract class shape
{
	double a,b;
	shape(double len,double br)
	{
		a = len;
		b = br;
	}
	shape(double rad)
	{
		a = rad;
	}
	abstract double printarea();
}

class rectangle extends shape
{
	rectangle(double len,double br)
	{
		super(len,br);
	}
	double printarea()
	{
		return a*b;
	}
}

class triangle extends shape
{
	triangle(double len,double br)
	{
		super(len,br);
	}
	double printarea()
	{
		return a*b*0.5;
	}
}
 
class circle extends shape
{
	circle(double rad)
	{
		super(rad);
	}
	double printarea()
	{
		return 3.14*a*a;
	}
}

class Main
{
	public static void main(String args[])
	{
		double ra,ta,ca;
		rectangle sp1 = new rectangle(3,4);
		triangle sp2 = new triangle(4,5);	
		circle sp3 = new circle(10);
		shape s;
		s = sp1;
		ra = s.printarea();
		System.out.println("Area of rectangle is" + " " + ra);

		s = sp2;
		ta = s.printarea();
		System.out.println("Area of triangle is" + " " + ta);

		s = sp3;
		ca = s.printarea();
		System.out.println("Area of circle is" + " " + ca);
	}
}
