class rotateArrayBy1Place{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};

        int temp = arr[0];  // store 1st element.
        int n = arr.length;

        for(int i = 1;i<n;i++){      // shifting forward 1 by 1 element..
            arr[i-1] = arr[i];
        }

        arr[n-1] = temp ;      // than place 1 element in back..


        // print all  elements..
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}