import java.util.Stack;

class insertAtbottom{
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        // creating another stack
        Stack<Integer> rt = new Stack<>();
        
        while(st.size() > 1 ){            // ish condition sa khai pe bhi element insert krwa skta hai..  change 1..
            rt.push(st.pop());            // taki st ka element rt mai chle jaye..
        }

        st.push(5);      // st mai new element insert kare hai..
        while(rt.size()>0){
            st.push(rt.pop());     // dubara rt ka element st mai daal rhe hai..
        }

        System.out.println("printing the st element: "+ st);
    }
}