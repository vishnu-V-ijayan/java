import java.util.Scanner;
class Multi extends Thread{
	public void run(){
		int num=5;
		System.out.printf("___MULTIPLICATION TABLE OF 5__");
		for(int i=1;i<=10;i++){
			System.out.printf("%d * %d = %d\n",num,i,num*i);
		}
}
}

class Prime extends Thread{
	public void run(){
		int i,j,flag;
		Scanner sc=new Scanner(System.in);
		System.out.println("___TO GENERATE First N PRIME NUMBERS__");
		System.out.println("Enter the Limit");
		int N=sc.nextInt();
		System.out.println("Prime numbers between 1 and"+N+" are: ");
		for( i=1;i<=N;i++){
			if(i==0 || i==1)
				continue;
				flag=1;
				for(j=2;j<=i/2;j++){
					if(i%j==0){
						flag=0;
						break;
					}
				}
			if(flag==1)
				System.out.println(i+" ");
		}
	}
}

public class ThreadClass{
	public static void main(String[] args) throws InterruptedException{
		Multi a = new Multi();
		a.start();
		a.sleep(200);
		Prime b=new Prime();
		b.start();
		b.sleep(200);
	}
}
