import java.util.HashSet;
import java.util.Set;
class RemoveDuplicates{
    public static void main(String[] args){
        int[] arr = {1,5,7,9,10,10};

        // brute force approach .. using Hashset..
        // bruteForce(arr);

        // using two pointers
        optimal(arr);
    }


    public static void optimal(int[] arr){
        int i = 0;
        int j = 1;
        int n = arr.length;

        while(j<n){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];    // array of i replace with array of j ...
            }
            j++;
        }

        System.out.println(i+1 +" Unique array");
        // for printing the array....  modify kiya hai same array mai.. starting ka uniue hai...
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }

    /* public static void bruteForce(int[] arr){
        Set<Integer> set = new HashSet<>();       // set duplicate element store nhi krta.. isliya set mai store kare hai..
        int n = arr.length;
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
         
        // isko krne sa unique element starting mai agya..
        int index = 0;
        for(int i : set){
            arr[index] = i;
            index++;
        }

        // print krke dikha rha hai...
        System.out.println("Brute force");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    } */

}