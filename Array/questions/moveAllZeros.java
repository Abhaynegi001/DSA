import java.util.ArrayList;
class moveAllZeros{
    public static void main(String[] args){
        int[] arr = {1,0,6,0,89,0,1,5,3,0,4,8,0,9};
        int n = arr.length;

        // brute force Approach...
        // bruteForce(arr , n);

        // optimal solution
        optimalSoln(arr , n);

        // printing the element
        for(int element : arr){
            System.out.print(element + " ");
        } 
    }
    public static void optimalSoln(int[] arr , int n){
        int j = -1;
        for(int i=0 ; i<n ; i++){
            if(arr[i]==0){
                j = i;         // store kara hai index... jab phla zero aayega...
                break;
            }
        }

        for(int i = j+1 ; i < n ;i++){
            if(arr[i]!= 0){        // yee swap kara hai zero ko jo j index mai hai...aage wale non zero number sa...
                int c = arr[i];
                arr[i] = arr[j];
                arr[j] = c;
                j++;
            }
        }
    }


    /* public static void bruteForce(int[] arr , int n){
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int i = 0;i<n;i++){
            if(arr[i] != 0 ){
                temp.add(arr[i]);         // non zero number store in the temp array..
            }
        }

        for(int i = 0;i<temp.size();i++){
            arr[i] = temp.get(i);        // non zero number ko firse array mai place kre hai..
        }

        for(int i = temp.size() ; i < n ;i++){     // last mai zero daal rha hai..
            arr[i] = 0;
        }
    } */
}