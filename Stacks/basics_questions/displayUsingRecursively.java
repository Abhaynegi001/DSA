import java.util.Stack;

class displayUsingRecursively{
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        displayRecursively(st); // display using the recurison.
    }

    static void displayRecursively(Stack<Integer> st){
        if(st.size() == 0 ) return;
        int top = st.pop();
        displayRecursively(st);
        System.out.print(top + " ");
        st.push(top);
    }
}