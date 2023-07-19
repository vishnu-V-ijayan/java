import java.util.*;
public class Product{
	int pcode;
	String pname;
	int price;
	public void get(){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the pcode:");
		pcode=sc.nextInt();
		System.out.println("Enter the product name:");
		pname=sc.next();
		System.out.println("Enter the price:");
		price=sc.nextInt();
	}
	public void put()
	{
		System.out.println("The Product details are:");
		System.out.println("The Product code:"+pcode);
		System.out.println("The Product name:"+pname);
		System.out.println("The Product price:"+price);
			}
	public static void main(String args[])
	{
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		p1.get();
		p2.get();
		p3.get();
		p1.put();
		p2.put();
		p3.put();	
		
		if(p1.price<p2.price && p1.price<p3.price)
		{
			System.out.println("The lowest price is:");
			p1.put();
		}
		else if(p2.price<p1.price && p2.price<p3.price)
		{
			System.out.println("The lowest price is:");
			p2.put();
		}
		else
		{ System.out.println("The lowest price is:");
			p3.put();
		}	
}
}
