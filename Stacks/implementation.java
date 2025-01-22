import java.util.Stack;
class implementation{
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();

        // adding the element in the stack.
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Top element in the stack: "+ st.peek());

        // removing the top element in stack
        st.pop();

        // return the peek means top most element in stack
        System.out.println("Top element in the stack: "+ st.peek());

        // printing the complete stack;
        System.out.println(st);

        // size of stack.
        System.out.println("size of stack: "+ st.size());
    }
}