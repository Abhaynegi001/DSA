class quickSort{
    public static void main(String[] args){
        int[] arr = {3,62,6,4,8,5,2,7,5};
        int low = 0;
        int high = arr.length - 1;

        quickSort(arr,low,high);
    }

    public static void quickSort(int[] arr , int low , int high){
        if(low < high) {
            int partiton  =  part(arr , low , high);      // finding a element correct position on the array.. and return back the index..
            quickSort(arr , low ,partiton - 1);       // for diving a array based on pivot (correct element index)  ... left portion
            quickSort(arr , partiton + 1 , high);       // same as right portion....

            // printing all elements and steps...
            for(int element : arr){
                System.out.print(element + " ");
            }
            System.out.println(" ");
        }
    }

    public static int part(int[] arr , int low ,int high){
        int pivot = arr[low];                           // jish element ko correct position mai rhkna hai...
        int left = low , right = high ;                 

        while(left < right){

            while(arr[left] <= pivot && left <= high -1 ){    // tab tk chlega jab tk koi element pivot sa bada element na aajya.... 
                left ++; 
            }

            while(arr[right] >= pivot && right >= low +1 ){     // tab tk kaam hoga jab tk koi pivot sa chota element na aajya...
                right--;
            }

            if(left < right){             // than unh dono ko swap krdega...
                int c = arr[left];
                arr[left] = arr[right];
                arr[right] = c;
            }
        }

        int c = arr[low];       // last mai jab high ,. low sa kaam hojya ga .. tab pivot ko right wala index ka sath swap krdega....
        arr[low] = arr[right];
        arr[right] = c;           

        return right;       // or correct position wale pivot ki index return krdega ...
    }

}