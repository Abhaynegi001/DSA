import java.util.Stack;

class underflow{
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println(st); // 1 2 3 4
        st.pop();
        System.out.println(st); // 1 2 3
        st.pop();
        System.out.println(st); // 1 2
        st.pop();
        System.out.println(st); // 1
        st.pop();
        System.out.println(st); // []  empty..
        st.pop();               // this line occur a error .. because the stack has already empty.
        System.out.println(st);
    }
}