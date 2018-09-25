class Main {
  public static void main(String[] args) 
{
class Main {
  public static void main(String[] args) {
    String address1=" Mr.Jack,Door No 21,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
      String address2="Ms Jill,Door No 53,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
      String address3="Mr Holmes,Door No 13,Valmiki Street,32d Main Road,Saidapet,Chennai,Pin-600115";
      String address4="Mr.Davinci,Door No 21,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
      String[] st1=address1.split(",");
      String[] st2=address2.split(",");
      String[] st3=address3.split(",");
      String[] st4=address4.split(",");
      int n1=st1.length;
      int n2=st2.length;
      int n3=st3.length;
      int n4=st4.length;
      System.out.println("names");
      System.out.println(st1[0]);
      System.out.println(st2[0]);
      System.out.println(st3[0]);
      System.out.println(st4[0]);
      String s1="";
      String s2="";
      String s3="";
      String s4="";
      System.out.println("addresses");
      int i;
      for( i=1;i<n1;i++)
    s1=s1+st1[i];
    for( i=1;i<n2;i++)
    s2=s2+st2[i];
    for( i=1;i<n3;i++)
    s3=s3+st3[i];
    for(i=1;i<n4;i++)
    s4=s4+st3[i];
	System.out.println(s1);
  if(s2.equals(s1) )
	System.out.println("Duplicate Address");
	else
	System.out.print(s2);
  System.out.println("");
  if(s3.equals(s1) || s3.equals(s2) )
	System.out.println("Duplicate Address");
	else
	System.out.print(s3);
  System.out.println("");
  if(s4.equals(s1) || s4.equals(s2) || s4.equals(s3))
	System.out.println("Duplicate Address");
	else 
	System.out.print(s4);
  System.out.println("MASON STREET:");
	for( i=0;i<n1;i++)
	if(st1[i].equals("Mason Street"))
	System.out.println(address1);
 
	for( i=0;i<n2;i++)
	if(st2[i].equals("Mason Street"))
	System.out.println(address2);
 
	for( i=0;i<n3;i++)
	if(st3[i].equals("Mason Street"))
	System.out.println(address3);
 
	for( i=0;i<n4;i++)
	if(st4[i].equals("Mason Street"))
	System.out.println(address4);
  if(st1[n1-1].startsWith("Pin")&&st2[n2-1].startsWith("Pin")&&st3[n3-1].startsWith("Pin")&&st4[n4-1].startsWith("Pin"))
	System.out.println("ALL ADDRESSES HAVE PINCODES");
	else
	System.out.println("NOT ALL ADDRESSES HAVE PINCODE");
  }
}
	
}   

}
      
  
