import java.util.Scanner;
public class palindrome{
  public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the word or(name) for checking its is Palindrome or not...");
	  String name = input.nextLine();
     if(palindrome(name)) System.out.println("It is a palindrome..");
     else System.out.println("not a palindrome.......");
  }
  public static boolean palindrome(String name){
      int sizz = name.length();
     for(int i = 0 ; i <= sizz / 2 ; i++){
       if(name.charAt(i) != name.charAt(sizz-1) ) {
          return false;
        }
          sizz--;
        }
        return true;
    }
}