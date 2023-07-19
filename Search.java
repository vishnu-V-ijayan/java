import java.util.*;
public class Search {
	public static void main (String[] args) {
		Scanner value = new Scanner(System.in);
		int i;
		int arr[] = new int[5];
		System.out.println("Enter Array Elements ");
		for (i=0;i<arr.length;i++)
		{
			arr[i] = value.nextInt();
		}
		System.out.println("Array Elements are: ");
		for (i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		int flag = 0;
		System.out.print("Enter Element to be searched: ");
		int element = value.nextInt();
		for (i=0;i<arr.length;i++)
		{
			if(arr[i] == element)
			{
				flag++;
				System.out.println("Element Found !!!");
				System.out.println("Element Found at Position: "+ (i+1));
			}
		}
		if (flag==0)
		{
			System.out.println("Element not found");
		}
	}
}
