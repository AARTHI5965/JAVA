class Main {
  public static void main(String[] args) {
   int number;
   Scanner read = new Scanner(System.in);
   System.out.print("");
   number = read.nextInt();
   read.close();
  if(number > 0)
        
    System.out.println("positive ");
        
  else if(number < 0)
        
    System.out.println("negative");
        
  else if(number==0)
        
    System.out.println("zero");
  else
     System.out.println(number+"neither positive nor negative nor zero");
    
      
 }
}