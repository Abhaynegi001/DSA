class reverseArray{
    public static void main(String[] args){
        int[] arr = {3,7,3,7,9,3,62,9,2};
        int length = arr.length;
        reverse(arr,length-1);
    }
    public static void reverse(int[] arr , int length){
        if(length < 0){
            return;
        }
        System.out.print(arr[length]+ " ");
        reverse(arr, length-1);
    }
}