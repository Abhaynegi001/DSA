public class test{
  public static void main(String[] args){
    int x = 121;
    if(x == pali(x)){
      System.out.println("yes");
    }
  }
  public static int pali(int x){
    int reverse = 0;
    while(x>0){
      int digit = x % 10;
      reverse = reverse * 10 + digit;
      x /= 10;
    }
 
    return reverse;
  }
}