public class Main {

  public static void main(String[] args) {

    int num = 29;
    String bag="";
    boolean flag = false;
    for (int i = 2; i <= num/2; ++i) {
      if (num % i == 0) {
      bag+=i;
        flag = true;
        break;
      }
    }
    System.out.println(bag);

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
  
}
