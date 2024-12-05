import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class printAllDivisors{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Print All divisors");
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        // creating a list for storing the values..
        ArrayList<Integer> value = new ArrayList<>();

        for(int i=1; i*i <= n; i++ ){
            if(n%i == 0){
                value.add(i);
                if((n/i)!=i){
                    value.add(n/i);
                }
            }
        }
 
        // for sorting the ArrayList..
        Collections.sort(value);
        for(Integer i : value){
            System.out.print(i+" ");
        }
    }
}