import java.util.HashMap;
class majorityElement{
    public static void main(String[] args){
        int[] arr = {2,2,3,3,1,2,2};

        // brute force using -      two for loops
        // brute(arr);

        // Better using -           hashing
        // Better(arr);

        // optimal using -          moore's voting Algorithm.
        optimal(arr);
    }

    public static void optimal(int[] arr){
        int count = 0;
        int n = arr.length;
        int element = arr[0];
        for(int i = 0;i< n ; i++){
            if(arr[i] == element){
                count++;
            }else if(count == 0){             // moore's voting Algorithm use..... explain in notebook..
                element = arr[i + 1];
                count = 1;
            }else{
                count --;
            }
        }

        // verify the element comes > n/2 times
        int occurs = 0;
        for(int i = 0;i<n; i++){
            if(arr[i] == element){
                occurs++;
            }
        }
        if(occurs > n/2){
            System.out.print(element);
        }else{
            System.out.print("not present");
        }

        
    }

    /* public static void Better(int[] arr){
        HashMap<Integer , Integer> map = new HashMap<>();       // expalin in noteBook.
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i] , 1);
            }
        }

        map.forEach((key , value) ->{
                if(value > n/2){
                    System.out.print(key);
                }
        });
    } */

    /* public static void brute(int[] arr){
        int n = arr.length;
        for(int i = 0;i < n; i++){
            int count = 0;
            for(int j = 0 ; j< arr.length ; j++){
                if(arr[i] == arr[j]){
                    count += 1;
                }
            }
            if(count > n/2){
                System.out.print(arr[i]);
                break;
            }
        }
    } */
}