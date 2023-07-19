import java.util.*;
class publisher{
	String pub_name;
	publisher()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Publisher name  :");
		pub_name=obj.next();
	}
}

class book extends publisher
{
	String book_name;
	book()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("book name  :");
		book_name=obj.next();
	}
}

class literature extends book
{
	
	void display()
	{
		System.out.println("Publisher name is :"+pub_name);
		System.out.println("book name is :"+book_name);
	}
}

class fiction extends book
{
	void display()
	{
		System.out.println("Publisher name is :"+pub_name);
		System.out.println("book name is :"+book_name);
	}
}

public class Library
{
	public static void main(String[] args)
	{
		int i=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the total number :");
		int size=obj.nextInt();
		literature arr1[]= new literature[size];
		fiction arr2[]=new fiction[size];
		System.out.println("enter the details of literature books :");
		for(i=0;i<size;i++)
		{
			
			arr1[i]=new literature();
		}
		System.out.println("enter the details of fiction books :");
		for(i=0;i<size;i++)
		{
			
			arr2[i]=new fiction();
		}
		System.out.println("\n\n\n\n");
		System.out.println("details of literature books :");
		for(i=0;i<size;i++)
		{
			arr1[i].display();
		}
		System.out.println("\n\n\n\n");
		System.out.println("details of fiction books :");
		for(i=0;i<size;i++)
		{
			arr1[i].display();
		}
	}
}
