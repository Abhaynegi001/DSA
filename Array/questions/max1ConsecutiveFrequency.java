class max1ConsecutiveFrequency{
    public static void main(String[] args){
        int[] arr = {1,1,0,1,1,1,1,0,1,1,1,1,1};
        int count = 0 , max1 = 0;

        // optimal solution..
        
        for(int i=0;i< arr.length ; i++){
            if(arr[i]==1){
                count++;
                max1 = max(max1 , count);
            }else{
                count = 0;
            }
        }

        System.out.print("maximum consecutive frequency is: "+ max1);
    }

    // return maximum of max1 and count..
    public static int max(int max1 , int count){
        if(max1 > count){
            return max1;
        }
        return count;
    }
}