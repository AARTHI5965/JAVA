import java.util.Scanner;
 class Dcoder
 { 
	public static void main(String args[])
 	{
 	
 int number;

  Scanner read = new        
  Scanner(System.in);

   System.out.print("");

   number = read.nextInt();

   read.close();
   if(number %4==0)
        System.out.println("leap year");
    else
      System.out.println("no");
        
      
	}
}	
 	

 	
 
    