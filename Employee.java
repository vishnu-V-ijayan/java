import java.util.*;
public class Employee {
	int eNo;
	String eName;
	int eSalary;
	public void get() {
		Scanner value = new Scanner(System.in);
		System.out.print("Enter Employee No: ");
		eNo = value.nextInt();
		System.out.print("Enter Employee name: ");
		eName = value.next();
		System.out.print("Enter Employee salary: ");
		eSalary = value.nextInt();
	}
	public void out(){
		System.out.println("Employee no is: " + eNo );
		System.out.println("Employee name: " + eName);
		System.out.println("Employee salary: " + eSalary);
	}	
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.print("Enter the number of Employees: ");
		int size = value.nextInt();
		Employee array[] = new Employee[size];
		System.out.println("Enter the Employee Details: ");
		for (int i=0;i<size;i++)
		{
			array[i] = new Employee();
			array[i].get();
		}
		System.out.println("The Employees Details are: ");
		for (int i=0;i<size;i++)
		{
			array[i].out();
		}
		int flag = 0;
		System.out.print("Enter eNo of Employee to be searched: ");
		int item = value.nextInt();
		System.out.println("The Employee searched is: ");
		for (int i=0;i<size;i++)
		{
			if(array[i].eNo == item)
			{
				array[i].out();
				flag = flag+1;
				break;
			}
		}
		if (flag==0)
		{
			System.out.println("Employee Not Foound");
		}
}
}
