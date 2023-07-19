import java.util.*;  
public class Mystring  
 {  
    public static void main(String[] args)  
    {  
      Scanner obj= new Scanner(System.in);  
      System.out.print("Enter 1st string: ");  
      String str1= obj.nextLine();  

      System.out.print("Enter 2nd string: ");  
      String str2= obj.nextLine();  
	  
	  System.out.println(str1.toUpperCase());
      System.out.println(str1.toLowerCase());
	  
	  System.out.println("After Concating :"+str1.concat(str2));
	  System.out.println(str1.equals(str2));
	  System.out.println("Length of the string 1 :"+str1.length());
	  System.out.println("Length of the string 2 :"+str2.length());
	  System.out.println("Compare :"+str2.compareTo(str1));
	  System.out.println("Character at the  position  :"+str1.charAt(4));
	  
	               
    }  
}
