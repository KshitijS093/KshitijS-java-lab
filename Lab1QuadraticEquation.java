import java.util.*;
import java.lang.*;
class box
{
 public static void main (String args[])
 {
  System.out.println("Enter the coefficients of quadrartic equation");
  Scanner sc= new Scanner(System.in);
  double a=sc.nextDouble();
  double b=sc.nextDouble();
  double c=sc.nextDouble();
  double d=(b*b)-(4*a*c);
  double r1;
  double r2;
  if(d>0)
  {
    r1=(-b+Math.sqrt(d))/(2*a);
    r2=(-b-Math.sqrt(d))/(2*a);
    System.out.println("Roots are real and distinct");
    System.out.println("The roots are r1="+r1+""+"and r2="+r2);
  }
 else if(d==0)
  {
    r1=r2=(-b)/(2*a);
    System.out.println("Roots are real and same");
    System.out.println("The roots are r1=r2="+""+r1);
  }
else
{
    r1=(-b)/(2*a);
    r2=(Math.sqrt(-d))/(2*a);
    System.out.println("Roots are imaginary and distinct");
    System.out.println("The roots are r1="+r1+"+i"+r2);
    System.out.println("The roots are r2="+r1+"-i"+r2);
}
}
}

 
