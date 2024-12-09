class insertionSort{
    public static void main(String[] args){
        int[] arr = {35,72,4,24,7,1,675};

        for(int i=1;i<arr.length ;i++){ // yee loop yaad rhkta hai.. kha tk aage chla gya hai hmmm.

            for(int j=i;j>0;j--){       // yee loop bta rha hai.. ish place sa check kro..niche ka place mai..    

                if(arr[j] < arr[j-1]){       // compare kara hai.. ki kha iska sahi place hai..or place change krne ka liya swap kara hai..
                    int c = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = c;
                    swap = false;
                }
            }
        }

        // printing sorted array..
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
}