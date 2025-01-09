import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;
class unionOfSortedArray{
    public static void main(String[] args){
        int[] arr1 = {1,1,3,5,8,9,11,67,99};
        int[] arr2 = {2,3,4,4,5,6,100};

        // bruteforce(arr1 , arr2);

        // optimal approach
        optimal(arr1 , arr2);
    }

    public static void optimal(int[] arr1 , int[] arr2){
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0 , j = 0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){               // agar arr1 chota hoga arr2 sa tab use hoga...
                if(!union.contains(arr1[i])){     // yee check kara hai..yee element phle sa present toh nhi hai...
                    union.add(arr1[i]); 
                }
                i++;
            }
            else{
                if(!union.contains(arr2[j])){
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        while(i < arr1.length){
            if(!union.contains(arr1[i])){         // agar koi element bach jayega arr1 ka tab use hoga...
                union.add(arr1[i]);
            }
            i++;
        }

        while(j < arr2.length){
            if(!union.contains(arr2[j])){          // agar koi element bach jayega arr2 ka tab use hoga...
                union.add(arr2[j]);
            }
            j++;
        }


        for(int element : union){
            System.out.print(element + " ");
        }

    }

    /* public static void bruteforce(int[] arr1 ,int[] arr2){
        Set<Integer> union = new HashSet<>();

        for(int i = 0 ;i<arr1.length ; i++){     // store unique element in union..  arr1
            union.add(arr1[i]);
        }

        for(int i = 0;i< arr2.length; i++){    // store unique element in union..  arr2
            union.add(arr2[i]);
        }
        
        System.out.print(union); // instead of you transfer a set union into a normal array... with the help of for loop.
    } */

}