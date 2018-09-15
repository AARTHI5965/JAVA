class Main {
  public static void main(String[] args) {
    String name="aarthi1997";
    count(name);
  }
  public static void count(String x){
    char[] test=x.toCharArray();
    int letter=0;
    int num=0;
    for (int i=0;i<x.length();i++){
      if(Character.isLetter(test[i]))
      letter ++;
      else if(Character.isDigit(test[i]))
      num++;
    }
System.out.println("letter"+letter);
System.out.println("number"+num);
int alphanumeric;
alphanumeric=letter+num;
System.out.println("alphanumeric"+alphanumeric);
  }
}