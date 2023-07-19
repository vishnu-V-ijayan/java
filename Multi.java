import java.util.*; 
class Person
{
	String name;
	String gender;
	String address;
	int age;
Person()
{
	Scanner sc=new Scanner(System.in);

	System.out.println("name:");
	name=sc.next();
	System.out.println("gender:");
	gender=sc.next();
	System.out.println("address:");
	address=sc.next();
	System.out.println("age:");
	age=sc.nextInt();
}
}
class Employee extends Person
{
	String empid;
	
	String company_name;
	String qualifiaction;
	int salary;
	
	Employee()
	{
	Scanner sc=new Scanner(System.in);

	System.out.println("Id:");
	empid=sc.next();
	System.out.println("Company name:");
	company_name=sc.next();
	System.out.println("qualifiaction:");
	qualifiaction=sc.next();
	System.out.println("Salary:");
	salary=sc.nextInt();
}}

class Teacher extends Employee
{
	String subject;
	
	String department;
	String teacherid;
		
	Teacher()
	{
	Scanner sc=new Scanner(System.in);

	System.out.println("Id:");
	teacherid=sc.next();
	System.out.println("Subject:");
	subject=sc.next();
	System.out.println("department:");
	department=sc.next();
}
void display()
{
	System.out.println("name:"+name);
	System.out.println("gender:"+gender);
	System.out.println("address:"+address);
	System.out.println("age:"+age);
	System.out.println("empid:"+empid);
	System.out.println("company_name:"+company_name);
	System.out.println("qualifiaction:"+qualifiaction);
	System.out.println("salary:"+salary);
	System.out.println("teacherid:"+teacherid);
	System.out.println("department:"+department);
	System.out.println("subject:"+subject);
	
}
}
public class Multi{
	public static void main(String args[])
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of teachers:");
		int n=sc.nextInt();
		Teacher e[]=new Teacher[n];
		for(i=0;i<n;i++)
		{
			e[i]=new Teacher();
			
		}
		for(i=0;i<n;i++){
			e[i].display();
		}
		
	}
}
