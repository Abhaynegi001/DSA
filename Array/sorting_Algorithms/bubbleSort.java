class bubbleSort{
    public static void main(String[] args){
        int[] arr = {3,62,63,7278,32,1,5};

        for(int i=1;i<arr.length-1 ; i++){      // yee for isliya hai taki j ka last last element chodta rha...

            boolean swap = true; // yee best case ka liya hai ... ki swap nhi huwa..thats means array is sorted...
            
            for(int j=0;j<arr.length-i;j++){       

                if(arr[j]>arr[j+1]){   // check and adjacent swap..
                    int c = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = c ;
                    swap = false ; 
                }
            }
            if(swap){
                break;
            }
        }
        
        // print the sorted array...
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
}