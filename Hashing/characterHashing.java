import java.util.Scanner;
class characterHashing{
    public static void main(String[] args){

        // Entering a string..
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.next();

        // creating a hashArray..
        int[] hashing = new int[26];

        // storing a character frequency...
        for(int i=0;i<str.length();i++){
            hashing[str.charAt(i) - 'a']++;
        }

        System.out.print("Enter how many number frequency you find: ");
        int n = input.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print("Enter the Alphabet you find frequency: ");
            char c =  input.next().charAt(0);

            System.out.println("Frequency is: "+hashing[c-'a']);
        }

    }
}