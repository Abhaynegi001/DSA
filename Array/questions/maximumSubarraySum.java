class maximumSubarraySum{
    public static void main(String[] args){
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};

        // brute and better solution    -       using 2 for loops.
        // brute(arr);


        // optimal solution             -       using Kanden's Algorithm.
        optimal(arr);
    }

    public static void optimal(int[] arr){        // explain in noteBook.

        int max = Integer.MIN_VALUE;
        int sum = 0;
        int startindex = -1, start = -1, end = -1;
        for(int i = 0;i<arr.length;i++){
            if(sum == 0){
                start = i;                // yee yaad rhk rha hai .. kha sa start kiya tha..
            }
            sum += arr[i];
            if(sum > max){
                max = sum;
                startindex = start;       // agar jha sa start kiya tha .. vo max hojta hai..tab starting confirm hojya gi...
                end = i;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        System.out.println("starting index is: "+startindex +" ending index is: "+end +" Maximum sum is: "+max);
    }

    /* public static void brute(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;                       
        int start = -1 , end = -1;

        for(int i = 0; i<n;i++){
            int sum = 0;
            for(int j = i ; j<n; j++){
                sum = sum +  arr[j];
                if(sum > max){
                    max = sum;
                    start = i; 
                    end = j;
                }
            }
        }

        System.out.println("Starting index is: "+start+" ending index is: "+end+" and sum is: "+max);
    } */
}