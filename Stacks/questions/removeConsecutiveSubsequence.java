import java.util.Stack;

class removeConsecutiveSubsequence{

    public static void main(String[] args){
        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};

        remove(arr);
    }
    static void remove(int[] arr){
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<arr.length;i++){
            if(st.size() == 0){     // stack is empty .. than push 1st element.
                st.push(arr[i]);
            }
            else if(st.peek() == arr[i]){   // stack peek element == arr[i] check some conditions
                if(arr[i] != arr[i+1]){      // that means you pop without any error.. in future.
                    st.pop();
                }
            }else{                   // if element is not equal to peek than push..
                st.push(arr[i]);
            }
        }

        int n = st.size();
        int[] ans = new int[n];
        for(int i = n-1;i>=0;i--){        // stack element ko array mai daal rha hai.. return krne ka liya.
            ans[i] = st.pop();
        }
 
        for(int i = 0;i<n;i++){            // print array element.. and answer..
            System.out.print(ans[i] + " ");
        }
    }
}