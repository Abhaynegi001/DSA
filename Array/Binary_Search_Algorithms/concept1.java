class concept1{
    public static void main(String[] args){
        int[] arr = {1,4,6,8,9,14,16,19,22};
        int target =2;

        int index = binarySearch(arr , target);

        System.out.print("Ans index is: " + index);
    }

    public static int binarySearch(int[] arr , int target){
        
        int low = 0 , high = arr.length-1;

        while(low <= high){
            int mid = low + (high - low) / 2;      // for preventing overflow condition
            
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
}