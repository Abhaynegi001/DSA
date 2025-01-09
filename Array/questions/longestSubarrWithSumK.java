import java.util.HashMap;
class longestSubarrWithSumK{
    public static void main(String[] args){
        int[] arr = {1,2,3,1,1,1,1,4,3,2};
        int k = 5;

        // brute force approach -       using two for loops.
        // bruteforce(arr , k);

        // better approach  -           using hashing with hashmap
        // better(arr,k);

        // optimal approach -           using two pointer.
        optimal(arr , k);

    }
    public static void optimal(int[] arr , int k){
        int i = 0 ;
        int j = 0;
        int sum = 0;
        int length=0;

        while(i < arr.length && j < arr.length){
            sum += arr[j];
            if(sum == k){
                sum = 0;
                length = Math.max(length , (j - i) + 1);
                i++ ;
                j = i; 
            }else if(sum > k){
                sum = 0;
                i++;
                j = i;
            }else{
                j++;
            }
        }

        System.out.print(length);
    }

    /* public static void better(int[] arr , int k){
        int currentSum = 0;
        int start = 0;
        int end = -1;
        int length = 0;

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length;i++){
            currentSum += arr[i];
            if(currentSum - k == 0){
                start = 0 ;
                end  = i;
                length = Math.max(length , (end - start) + 1);
                // break;
            }
            if(map.containsKey(currentSum - k)){
                start = map.get(currentSum - k) + 1;
                end = i;
                length = Math.max(length , (end - start) + 1);
                // break;
            }

            map.put(currentSum , i);
        }
        if(end == -1){
            System.out.println("Not found");
        }else{
            System.out.print(start + " " + end + " lenght : "+ length);
        }
    } */



    /* public static void bruteforce(int[] arr , int k){
        int max = 0;
        for(int i = 0; i< arr.length;i++){
            int sum = 0;
            
            for(int j = i ; j<arr.length;j++){
                sum += arr[j];

                if(sum == k){
                    max = Math.max(max , j - i + 1);
                }

                if(sum > k){
                    break;
                }
            }
        }
        System.out.print(max);
    } */

}