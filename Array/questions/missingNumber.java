class missingNumber{
    public static void main(String[] args){
        int[] arr = {1,2,4,5};
        int N = 5;                      // this is given in the question

        // brute force Approach -       using two for loops.
        // bruteForce(arr,N);

        // better approach  -           using hashing..
        // better(arr , N);

        // optimal solution -           using sum..
        // optimalSum(arr , N);

        // optimal solution -           using XOR..
        optimalXor(arr , N);

    }
    public static void optimalXor(int[] arr , int N){
        int xor1 = 0 , xor2 = 0;                // explain in note book.

        for(int i=0;i<arr.length ; i++){
            xor1 = xor1 ^ arr[i];

            xor2 = xor2 ^  i+1;
        }

        xor2  = xor2 ^ N;

        int result = xor1 ^ xor2;

        System.out.print("missing no is: "+ result);
    }

    /* public static void optimalSum(int[] arr , int N){
        int sum1 = N * (N + 1) / 2;             // Sum of N natural number.
        int sum2 = 0;
        for(int i = 0 ; i<arr.length ; i++){
            sum2 += arr[i];                     // sum of array element.
        }
        System.out.print("missing no is: "+sum1 - sum2);       
    }*/

    /* public static void better(int[] arr , int N){

        int[] hashArr = new int[N+1];           // creating hasharr

        for(int i=0;i< arr.length;i++){
            hashArr[arr[i]] = 1;                // all presented element fill with 1 .... in hasharr.
        }

        for(int j=1;j<N;j++){
            if(hashArr[j] == 0){                // if anyone is 0 that means it is missing number..
                System.out.print("missing no is: " + j );
                break;
            }
        }
    } */

    /* public static void bruteForce(int[] arr , int N){
        for(int i = 1 ; i<=N ; i++){
            boolean flag = true;
            for(int j = 0;j < arr.length; j++){
                if( i == arr[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.print("Missing no is: "+ i);
                break;
            }

        }
    } */
}