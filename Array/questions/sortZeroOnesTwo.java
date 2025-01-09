class sortZeroOnesTwo{
    public static void main(String[] args){
        int[] arr = {0,1,2,0,1,2,1,2,0,0,0,1};


        // better approach
        // better(arr);

        // optimal approach using -     Dutch National flag Algorithm
        optimal(arr);
    }

    public static void optimal(int[] arr){
        int low = 0 , mid = 0 , high = arr.length -1;      // explain in note book..

        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr , low , mid);
                low++; mid++;
            }else if(arr[mid] == 2){
                swap(arr , mid,high);
                high--;
            }else{
                mid++;
            }
        }

        for(int element : arr){
            System.out.print(element + " ");
        }
    }

    public static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    /* public static void better(int[] arr){
        int count0 = 0 , count1 = 0, count2 = 0;
        for(int i = 0;i<arr.length; i++){
            if(arr[i] == 0) count0 += 1;
            else if(arr[i] == 1) count1 +=1;
            else count2 += 1;
        }

        for(int i = 0; i<count0;i++) arr[i] = 0;

        for(int i = count0 ; i < count1 + count0 ; i++) arr[i] = 1;

        for(int i = count0 + count1 ; i < count0 + count1 + count2; i++) arr[i] = 2;
        

        for(int element : arr) System.out.print(element + " ");
    } */
}