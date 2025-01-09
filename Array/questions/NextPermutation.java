class NextPermutation{
    public static void main(String[] args){
        int[] arr = {2,1,5,4,3,0,0};

        // optimal solution
        optimal(arr);
    }

    public static void optimal(int[] arr){           // explain in noteBook.
        int index = -1;              
        int n = arr.length;

        // breakpoint dhundna ka liya..
        for(int i = 0; i<n-1;i++){
            if(arr[i] < arr[i+1]){
                index = i;
                break;
            }
        }

        if(index == -1){
            reverse(arr , 0 , n-1);
        }

        // break point sa thoda bada element dhundna ka liya..
        for(int i = n-1 ; i >= index ; i--){
            if(arr[i] > index){
                swap(arr,i,index);
                break;
            }
        }

        // break point ka baad wale element ko ko sorted order mai dalna ka liya..
        reverse(arr , index + 1 , n-1);

        // Next permutation answer.
        print(arr);


    }

    public static void reverse(int[] arr , int start , int end){
        while(start <= end){
            swap(arr , start , end);
            start++;
            end--;
        }
    }

    public static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void print(int[] arr){
        for(int element : arr){
            System.out.print(element+" ");
        }
    }
}