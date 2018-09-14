class Main {
  public static void main(String[] args) {
     int a=5,b=10;
      System.out.println(a+b);
      System.out.println(a-b);
      System.out.println(a*b);
      System.out.println(b/a);
      System.out.println(b%a);
      System.out.println(b++);
      System.out.println(b--);
      System.out.println(a&b);
      System.out.println(a|b);
      System.out.println(a^b);
      System.out.println(~a);
      System.out.println(a<<2);                   
      System.out.println(a>>2);                   
      System.out.println(a>>>2); 
      boolean c=(a<b && b>a);
      if(c)
        System.out.println("true");
      else
        System.out.println("false");
      
      boolean d=(a>b && b>a);
        
      if (d)
        System.out.println("true");
      else
        System.out.println("false");
      boolean e=(!(a<b && b>a));
      if (e)
        System.out.println("true");
      else
        System.out.println("false");
  }
}