class lower_upperBond{
    public static void main(String[] args){
        int[] arr = {2,3,6,7,8,8,11,11,12};
        int n = arr.length;
        int target = 11;

        // lowerBond(arr , n , target);

        upperBond(arr , n , target);
    }

    public static void lowerBond(int[] arr, int n , int target){

        int low = 0 , high = n-1 , ans = n;
        while(low <= high){
            int mid = low + (high - low) /2;
            if(arr[mid] >= target){
               ans = mid;
               high = mid - 1;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        System.out.print("target lower bond index is: "+ans);
    }

    public static void upperBond(int[] arr, int n , int target){

        int low = 0 , high = n-1 , ans = n;

        while(low <= high){
            int mid = low + (high - low) /2;

            if(arr[mid] > target){
               ans = mid;
               high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        System.out.print("target upper bond index is: "+ans);
    }
}