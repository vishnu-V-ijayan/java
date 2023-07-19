import java.util.*;
public class Cpu
{
	int price;
	public void price_input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the price of CPU : ");
		price = in.nextInt();
	}
	public void print()
	{
		System.out.println("Price : "+price);
	}
	public class Processor
	{
		int no_of_cores;
		String man;
		Processor()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the No:of cores : ");
			no_of_cores = sc.nextInt();
			System.out.println("Enter the Manufacturer : ");
			man = sc.next();
		}
		void print()
		{
			System.out.println(" No:of cores : "+no_of_cores);
			System.out.println(" Manufacturer : "+man);
		}
			
		
	}
  static class RAM
			{
				static int mem_size;
				static String man;
				RAM()
				{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the memory size ofRAM : ");
				mem_size = sc.nextInt();
				System.out.println("Enter the Manufacturer : ");
				man = sc.next();
				}
				void print()
				{
				System.out.println(" Memory Size : "+mem_size);
				System.out.println(" Manufacturer : "+man);
				}
			}
  public static void main(String args[])
		{
			Cpu c = new Cpu();
			Cpu.Processor p = c.new Processor();
			Cpu.RAM r = new Cpu.RAM();
			c.price_input();
			p.print();
			r.print();
			c.print();
		}

}
