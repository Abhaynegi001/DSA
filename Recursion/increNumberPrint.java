import java.util.Scanner;
class increNumberPrint{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to print... ");
        int num = input.nextInt();
        int count = 1 ;
        printNum(count , num); 
    }

    public static void printNum(int count , int num){
        System.out.println("Number is ... " + count);
        if(count == num){
            return;
        }
        // count++;
        printNum(count+1,num);
    }
}