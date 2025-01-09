import java.util.ArrayList;
class rearrangeArrayElementBySign{
    public static void main(String[] args){
        int[] arr = {3,1,-2,-5,2,-4};

        // bruteforce Appraoch
        // bruteforce(arr);

        // optimal approach
        // optimal(arr);

        // optimal is bruteforce in the case if positive != negative.
        variety2();
    }

    public static void variety2(){     // easy same as previous bruteforch but some twist in.. indexing and if else for who is greater. positive > negative or n > p

        int[] arr = {-1,2,3,4,-3,1};

        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for(int i = 0;i<arr.length;i++){
            if(arr[i] > 0){
                positive.add(arr[i]);
            }else{
                negative.add(arr[i]);
            }
        }

        if(positive.size() > negative.size()){     

            for(int i=0 ; i<negative.size(); i++){
                arr[i*2] = positive.get(i);
                arr[i*2 + 1] = negative.get(i);
            }
            int index = negative.size() *2;      // its remained tha array index .. where we start adding new elements.
            for(int i = negative.size(); i<positive.size(); i++){  // yee loop bacha huwa elements ko dalta hai..
                arr[index]= positive.get(i);  
                index++; 
            }

        }else{

            for(int i=0 ; i<positive.size(); i++){
                arr[i*2] = positive.get(i);
                arr[i*2 + 1] = negative.get(i);
            }
            int index = positive.size() *2 ;     // its remained tha array index .. where we start adding new elements.
            for(int i = positive.size(); i<negative.size(); i++){
                arr[index]= negative.get(i);
                index++; 
            }

        }


        for(int element : arr){
            System.out.print(element + " ");
        }

    }


    /* public static void optimal(int[] arr){        // optimal soln expalin in notebook
        int n = arr.length;
        int[] ans = new int[n];
        int positive = 0 , negative = 1;

        for(int i = 0; i<n;i++){
            if(arr[i] > 0){
                ans[positive] = arr[i];
                positive += 2;
            }else{
                ans[negative] = arr[i];
                negative += 2;
            }
        }

        for(int element : ans){
            System.out.print(element + " ");
        }
    } */


    /* public static void bruteforce(int[] arr){
        int n = arr.length;
        int[] positive = new int[n/2];
        int[] negative = new int[n/2];            // code explain in notebook..

        int j = 0 , k = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] > 0){
                positive[j] = arr[i];
                j++;
            }else{
                negative[k] = arr[i];
                k++;
            }
        }

        for(int i = 0;i < n/2 ; i++){
            arr[2*i] = positive[i];          // positive element ko arr ka even place mai rhk rha hai..
            arr[2*i +1] = negative[i];       // negative element ko arr ka odd place mai rhk rha hai..
        }

        // print array element..
        for(int element : arr){
            System.out.print(element + " ");
        }
    } */
}