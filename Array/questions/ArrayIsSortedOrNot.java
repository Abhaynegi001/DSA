class ArrayIsSortedOrNot{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,4};
        
        System.out.print("Array is: " + checkSortedOrNot(arr));
    }

    public static boolean checkSortedOrNot(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i] <= arr[i+1]){
                
            }else{
                return false;
            }
        }
        return true;
    }
}