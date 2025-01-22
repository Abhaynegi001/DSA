class LinkedlistImplementationStack{

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    // stack ke functions or usse implement karwaya hai..  using a linked list..
    // easy hai.. function bnana agar linked list aati hai. toh..
    
    static class Stack{
        Node head = null;
        int size = 0;

        void push(int value){
            Node temp = new Node(value);
            temp.next = head;
            head = temp;
            size++;
        }

        void displayrec(Node h){
            if(h == null) return;
            displayrec(h.next);
            System.out.print(h.data + " ");
        }

        void display(){
            displayrec(head);
            System.out.println();
        }

        int peek(){
            return head.data;
        }

        int pop(){
            if(head == null){
                System.out.println("stack is empty");
                return -1;
            }
            int x = head.data;
            head = head.next;
            return x;
        }
    }

    public static void main(String[] args){
        Stack st = new Stack();
        st.push(34);
        st.push(14);
        st.push(24);

        st.display();

        System.out.println("Size of the stack is: "+st.size );

        System.out.println("peek element of the stack is: "+st.peek() );

        st.pop();

        st.display();
    }
}