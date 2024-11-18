import java.util.Scanner;
class sumOfNnumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Nth number you want to sum.. ");
        int num = input.nextInt();
        System.out.println("sum is: "+ sum(num));
    }

    public static int sum(int n){
        if(n==1){
            return 1;
        }

        return n + sum(n-1);
    }
}