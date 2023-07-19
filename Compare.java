import java.util.Scanner;
public class Compare{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array ");
		int l =sc.nextInt();
		String str[] = new String[l];
		int i;
		System.out.println("Enter the elements for array: ");
		for(i=0;i<str.length;i++){
			str[i]=sc.next();
		}
		System.out.println("The array : ");
		for(i=0;i<str.length;i++){
			System.out.println(str[i]);
		}
		String temp;
		int j;
		for(i=0;i<str.length;i++){
			for(j=i+1;j<str.length;j++){
				if(str[i].compareTo(str[j])>0){
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		System.out.println("The Sorted Array : ");
		for(i=0;i<str.length;i++){
			System.out.println(str[i]);
		}
	}
}
