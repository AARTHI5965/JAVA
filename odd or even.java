import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   int number;
   Scanner read = new Scanner(System.in);
   System.out.print("Enter the number you want to check:");
   number = read.nextInt();
   read.close();
  if(number%2==0)
        
    System.out.println("even");
  else if(number%2!=0)
     System.out.println("odd");
  else
     System.out.println("invalid");
  }
}