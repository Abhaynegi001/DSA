import java.util.ArrayList;
class rotateArrayByNplace{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int d = 2;

        // brute force approach...
        // rotate(arr , n ,d);


        // optimal solution...
        if(d > n){
            d %= n;
        }
        reverse(arr , 0 , d-1);
        reverse(arr , d , n-1);        // reverse a array in parts..
        reverse(arr , 0 , n-1);

        for(int ele : arr ){
            System.out.print(ele + " ");       // printing the array..
        }
    }

    public static void reverse(int[] arr , int start , int end){
        while(start < end){
            int c = arr[start];
            arr[start] = arr[end];          // swap and than reverse
            arr[end] = c ; 

            start++;
            end--;
        }
    }

    /* public static void rotate(int[] arr , int n , int d){
        ArrayList<Integer> temp = new ArrayList<>();

        if(d > n){
            d %= n;            // yee bade d ki value ko chota krega..
        }

        for(int i=0;i<d;i++){   // jitna element rotate krne hai... unko store krega...
            temp.add(arr[i]);
        }

        for(int j = d; j< n ; j++){    // piche ka element forward shift krega...
            arr[j -d] = arr[j];
        }

        for(int k = n-d; k < n;k++){
            arr[k] = temp.get(k - (n -d));      // temp mai store kiya gya element ko ...piche daalega..
        }
    }*/
}