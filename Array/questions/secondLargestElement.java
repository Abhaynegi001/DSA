class secondLargestElement{
    public static void main(String[] args){
        int[] arr = {4,7,5,2,5,7,5,7,4,4};

        int n = arr.length;
        int largest = arr[0];
        int secondLargest = -1;

        for(int i=0;i<n;i++){
            if(largest < arr[i]){
                secondLargest = largest;
                largest = arr[i];
            }else if(secondLargest < arr[i] && largest != arr[i] ){
                secondLargest = arr[i];
            }
        }

        System.out.print("Second largest element is: "+secondLargest);
    }
}