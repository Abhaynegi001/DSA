class ArrayImplementationStack{

    static class Stack{
        int[] arr = new int[10];    
        int index = 0;               // important hai.. index sa khelna ka liya.

        void push(int x){
            arr[index] = x;
            index++;
        }

        int peek(){
            return arr[index-1];
        }

        int pop(){
            int val = arr[index-1];
            index--;
            return val;
        }

        void display(){
            for(int i=0;i<index;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size(){
            return index;
        }

        boolean isEmpty(){
            if(size() == 0) return true;
            else return false;
        }

        boolean isFull(){
            if(size() == 10) return true;
            else return false;
        }
    }

    public static void main(String[] args){
        Stack st = new Stack();

        st.push(40);
        st.push(20);
        st.push(30);

        st.display();

        System.out.println("peek element: " + st.peek());

        st.pop();

        st.display();

        System.out.println("peek element: " + st.peek());

        st.push(999);

        st.display();

        System.out.println("size of stack: " + st.size());

        System.out.println("stack is Empty: " + st.isEmpty());

        System.out.println("stack is full: " + st.isFull());

    }
}