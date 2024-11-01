import java.util.Scanner;
public class fibonacciNumber{
  public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the nth number of fibonnaci series...");
	   long number = input.nextInt();
     fibonnaci(number);
  }
  public static void fibonnaci(long num){
     long first = 0 , sec = 1 ; 
     System.out.printf("%d %d ",first,sec);
     for(int i = 2; i < num; i++){
       long third = first + sec;
       System.out.printf("%d ",third);
       first = sec ; 
       sec = third ;  
     }
  }
}