class selectionSort{
    public static void main(String[] args){
        int[] arr = {13,46,24,52,20,9};

        for(int i=0;i<=arr.length-2 ; i++){     // yee length sa 2 step kaam chlega...
            int min = i;
            for(int j=i;j<arr.length ; j++){       // yee length-1 tak chlega...

                if(arr[j]<arr[min]){    // yee array ka last index tk dekhega konsa element first element sa chota hai..
                    min = j;             // tab min mai update kreaga...
                }
            }
            // for swapping min element index to starting index....
            int c = arr[i];
            arr[i] = arr[min];
            arr[min] = c;
        }

        // printing the sorted array..
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
}