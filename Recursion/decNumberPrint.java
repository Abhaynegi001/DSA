import java.util.Scanner;
class decNumberPrint{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you wanted to print... ");
        int num = input.nextInt();
        printNum(num);
    }

    public static void printNum(int num){
        if(num==0){
            return;
        }
        System.out.println("Number is "+num);
        // num--;
        printNum(--num);

    }
}