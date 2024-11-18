import java.util.Scanner;
class print1toN{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to print... ");
        int num = input.nextInt();
        printNum(num , num); 
    }

    public static void printNum(int i , int num){
        if(i<1){
            return;
        }
        printNum(i-1,num);
        System.out.println("Number is.... " + i);
    }

}