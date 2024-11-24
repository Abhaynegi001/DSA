import java.util.Scanner;
class basic{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array.");
        int n = input.nextInt();
        int[] myarr =  new int[n];

        // for inputing the element of array..
        for(int i=0;i<myarr.length;i++){
            System.out.print("Input "+(i+1)+" element.");
            myarr[i] = input.nextInt();
        }


        // creating integer hashArray...
        int[] hashArr = new int[100];


        for(int i=0;i< myarr.length;i++){
            hashArr[myarr[i]]++;
        }


        System.out.print("how many number frequency you find..");
        int find = input.nextInt();

        for(int i=0;i<find;i++){
            System.out.print("\nEnter number you find frequency. ");
            int number = input.nextInt();

            System.out.print("Frequency is "+ hashArr[number]);
            
        }

        // // printing how many numbers come in myarr..
        // for(int i=0;i<hashArr.length;i++){
        //     System.out.print(hashArr[i] + " ");
        // }



    }
}