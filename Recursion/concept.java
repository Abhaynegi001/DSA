import java.util.Scanner;
class concept{
    /** Recursion - when a fuction call itself until the specific condition is meet.. (base condition) */
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter how many name printed.......");
        int num = input.nextInt();
        int count = 1;
        print(count,num);
    }

    public static void print(int count , int num){
        System.out.println("Abhay Negi......"+ count);
        if(count == num){      // base case...
            return;
        }
        count++;
        print(count,num);
    }
}