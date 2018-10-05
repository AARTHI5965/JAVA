import java.util.Scanner;
 class Main
 { 
	public static void main(String args[])
 	{
 	int a;
 	Scanner read = new        
 	Scanner(System.in);
  a=read.nextInt();
  int count = 0;

  while(a != 0)
  {
    a /= 10;
    ++count;
  }

   System.out.println(count);
    }
   }

