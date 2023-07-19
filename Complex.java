import java.util.Scanner;
public class Complex{
    public static void main(String[] args){
       Scanner obj = new Scanner(System.in);
	   System.out.print("Enter complex no1:");
	   int a = obj.nextInt();
	   int b = obj.nextInt();
	   System.out.print("Enter complex no2:");
	   int c = obj.nextInt();
	   int d = obj.nextInt();
	   int real = a+c;
	   int img = b+d;
	   System.out.print(real+"+"+img+"i");
    }
}