import java.util.HashMap;
class TwoSum{
    public static void main(String[] args){
        int[] arr = {2,6,5,8,11};
        int target = 9;

        // brute forch approach using -     two for loops.
        // brute(arr,target);

        // optimal using -                  hashing.
        optimal(arr,target);


        // optimal using-                 2 pointer for yes or no
        // optimalYEs(arr,target);
    }

    /* public static void optimalYEs(int[] arr, int target){
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            if(arr[i] + arr[j] < target){
                i++;
            }else if(arr[i] + arr[j] > target){
                j--;
            }else if(arr[i] + arr[j] == target){
                System.out.print("yes");
                break;
            }
            else System.out.print("No");
        }
    } */

     public static void optimal(int[] arr, int target){
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i= 0 ;i < arr.length; i++){                 // approach explain in notebook...
            if(map.containsKey(target - arr[i])){
                System.out.print("index: "+ map.get(target - arr[i]) + " " + i);
                break;
            }
            map.put(arr[i] , i);
        }
    } 

    /* public static void brute(int[] arr , int target){

        for(int i = 0; i <arr.length ;i++){
            boolean flag = false;
            for(int j= i+1 ; j < arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    System.out.print("index: " + i +" "+j);
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
    } */
}