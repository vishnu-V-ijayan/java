import java.util.*;
interface product
{
	public void getdata();
	public void display();
	public void calc();
}

class calculate implements product
{
	int pid;
	String name;
	double quantity;
	double unit_price,total;
	public void getdata()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the product id :");
		pid=obj.nextInt();
		System.out.println("enter the name :");
		name=obj.next();
		System.out.println("enter the quantity :");
		quantity=obj.nextDouble();
		System.out.println("enter the unit_price :");
		unit_price=obj.nextDouble();
	}
	
	public void calc()
	{
		total =quantity * unit_price;
	}
	public void display()
	{		System.out.println(pid+"\t\t"+name+"\t\t"+quantity+"\t\t"+unit_price+"\t\t"+total);		
	}
}
class bill{
	public static void main(String[] args)
	{
		int i,odno,n;
		String date;
		double net_amnt =0;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter order number :");
		odno=obj.nextInt();
		System.out.println("enter the date :");
		date=obj.next();
		System.out.println("enter the total number products :");
		n=obj.nextInt();
		calculate arr[]= new calculate[n];
		for(i=0;i<n;i++)
		{
			arr[i] = new calculate();
			arr[i].getdata();
			arr[i].calc();
		}
		System.out.println("Order no : #"+odno);
		System.out.println("Date :"+date);
		System.out.println("Product Id	Name	Quantity	Unit Price	Total");	System.out.println("=====================================");
		for(i=0;i<n;i++)
		{
			arr[i].display();
			net_amnt +=arr[i].total;	
		}
	System.out.println("================================");
		System.out.println("\t\t\t\t\t\tNet Amount :"+net_amnt);	
	}
}
