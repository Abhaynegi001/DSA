class elementAppearsOnces{
    public static void main(String[] args){
        int[] arr = {1,1,2,5,2,3,3,4,4};

        // brute force approach -           using two for loops.
        // bruteForce(arr);

        // better approach -                using hashing..
        // better(arr);

        // optimal approach -               using XOR
        optimal(arr);
    }

    public static void optimal(int[] arr){
        int xor = 0;                         // previous concept.. jo use huwa tha missing number mai..
        for(int i = 0; i< arr.length;i++){
            xor = xor ^ arr[i];
        }

        System.out.print("element that appears onces is: " + xor);
    }



    /* public static void better(int[] arr){

        int n = max(arr);                       // explain in note book.
        int[] hashArr = new int[n + 1];

        for(int i = 0 ; i < arr.length ; i++){
            hashArr[arr[i]]++;
        }

        for(int j = 0; j < hashArr.length ; j++){
            if(hashArr[j] == 1){
                System.out.print("element that appears onces is: "+ j);
                break;
            }
        }
    } */



    /* public static void bruteForce(int[] arr){
        for(int i=0;i<arr.length ; i++){
            int count = 0;
            for(int j = 0;j<arr.length ; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.print("element that appears onces is: "+arr[i]);
            }
        }
    }*/

    public static int max(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }
}