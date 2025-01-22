import java.util.Stack;

class displayPrint{
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

       // printing the stack element using one more stack..   method.

        /* Stack<Integer> rt = new Stack<>();
        while(st.size() > 0){
            rt.push(st.pop());
        }

        // print the element and get back the element in st.
        while(rt.size() > 0){
            System.out.print(rt.peek() + " ");
            st.push(rt.pop());
        }

        System.out.print("\nSt element: " + st); */

        int n = st.size();
        int[] arr = new int[n];

        for(int i = st.size()-1; i>=0; i--){
            arr[i] = st.peek();             // array mai element sahi tarika sa daal rha hai.. 
            st.pop();
        }

        // array ka element print hore hai.. check krne ka liya bss..     not compulsory.

        System.out.print("Array element: ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
 
        System.out.println();

        // st mai dubara element daalega.. or print bhi krega.

        System.out.print("printing st element: ");
        for(int i=0;i<n; i++){
            System.out.print(arr[i] + " ");
            st.push(arr[i]);
        }

        System.out.println();
        System.out.println("St is same: "+ st);
    }
}