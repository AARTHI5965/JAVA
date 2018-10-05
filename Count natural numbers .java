import java.util.Scanner;


 class Dcoder
 { 
	public static void main(String args[])
 	{ 

		int number;

  Scanner num = new        
  Scanner(System.in);
  number = num.nextInt();
  int count = 1, sum = 0;
   while(count <= number ) 
   { 
   	sum = sum + count;
   	 count++;
   	  }
   System.out.println(sum);
 	}
 }