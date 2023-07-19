import java.util.Scanner;
class Fibonacci implements Runnable{
	public void run(){
		int first=0,second=1,next=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("___TO GENERATE FIBONACCI SERIES__");
		System.out.println("Enter the number of terms required ");
		int n =sc.nextInt();
		System.out.println("Series generated");
		for(int i=0;i<=n;i++){
			System.out.println(first+" ");
			next=first+second;
			first=second;
			second=next;
		}
	}
}

class EvenNo implements Runnable{
	public void run(){
		int lower , upper;
		Scanner sc=new Scanner(System.in);
		System.out.println("___TO GENERATE EVEN NUMBERS IN A GIVEN RANGE__");
		System.out.println("Enter the Lower Limit");
		lower=sc.nextInt();
		System.out.println("Enter the Upper Limit");
		upper=sc.nextInt();
		for(int i=lower;i<=upper;i++){
			if(i%2==0){
				System.out.println(i+" ");
				i++;
			}
			else{
				break;
			}
		}
	}
}

public class Threadrunner{
	public static void main(String[] args) throws InterruptedException{
		Fibonacci obj = new Fibonacci();
		Thread a =new Thread(obj);
		a.start();
		a.sleep(2000);
		EvenNo obj1=new EvenNo();
		Thread b=new Thread(obj1);
		b.start();
		b.sleep(1000);
	}
}
