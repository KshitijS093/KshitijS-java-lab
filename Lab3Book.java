import java.util.*;
class Book{
	Scanner sc = new Scanner(System.in);
	String name;
	String author;
	int price;
	int num_pages;
 	Book()
	{
	System.out.println("Enter book name");
	name = sc.next();
	System.out.println("Enter author name");
	author = sc.next();
	System.out.println("Enter number of pages");
	num_pages = sc.nextInt();
	System.out.println("Enter price");
	price = sc.nextInt();	
	}
	void set()
	{
	    System.out.println("All inputs are set");
	}
	void get()
	{
	System.out.println("The details of the book are" + name + " " + author + " " + num_pages + " " + price);
	}
	public String toString()
	{
	 return  name + " " + author + " " + num_pages + " " + price;  
	}
}
class Main
{
	public static void main(String args[])
	{
	int r,i;
	System.out.println("Enter number of books");
	Scanner sc = new Scanner(System.in);
	r = sc.nextInt();
	Book b[] =  new Book[r];
	for(i = 0;i<r;i++)
	{
	b[i] = new Book();
	b[i].set();
	b[i].get();
	}
	for(i = 0;i<r;i++)
	{
	System.out.println(b[i]);
	}
    }
}
