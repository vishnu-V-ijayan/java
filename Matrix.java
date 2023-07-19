import java.util.*;
public class Matrix{
	public static void main(String args[]){
		Scanner obj =new Scanner(System.in);
		System.out.println("enter the size of matrix:");
		int n=obj.nextInt();
		int arr1[][] = new int [n][n];
		int arr2[][] = new int [n][n];
		int arr3[][] = new int [n][n];
		
		System.out.println("enter the elements in 1st matrix:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr1[i][j] = obj.nextInt();
		
	}
}
System.out.println("enter the elements in 2nd matrix:");
for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++)
			{
				arr2[i][j] = obj.nextInt();
		
	}
}
	System.out.println("--------------------");	
    for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
{
				System.out.print(arr1[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
		System.out.println("--------------------");	
	for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr2[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
	for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
	System.out.println("--------------------");	
	for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr3[i][j]+" ");
			}
System.out.println();
		}
		
	}
}
