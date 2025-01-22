import java.util.Stack;

class copyStack{
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println("st element print: " + st);

        Stack<Integer> gt = new Stack<>();
        while(st.size() > 0){
            int x = st.peek();
            gt.push(x);           // yee 3 line ka kaam..    gt.push(st.pop());   yee kaar skta hai..
            st.pop();
        }
        System.out.println("gt element print: " + gt);

        Stack<Integer> rt = new Stack<>();
        while(gt.size() > 0){
            rt.push(gt.pop());
        }

        System.out.println("rt element print: " + rt);
    }
}