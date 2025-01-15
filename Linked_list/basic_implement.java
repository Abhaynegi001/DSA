class basic_implement{
    public static class Node{
        int data;          // value.
        Node next;         // address of next noode.

        Node(int data){               // constructor
            this.data = data;
        }
    }

    public static void main(String[] args){
        Node a = new Node(4);
        Node b = new Node(7);
        Node c = new Node(1);
        Node d = new Node(10);
        // 4   7   1   10
        a.next = b;   // 4 -> 7  1   10
        b.next = c;   // 4 -> 7 ->  1   10
        c.next = d;   // 4 -> 7 ->  1 ->  10 -> null              Linked list..

        // simple way to print linked list.
        // System.out.println(a.data);                     // 4
        // System.out.println(a.next.data);                // 7          without using b.
        // System.out.println(a.next.next.data);           // 1          without using c.
        // System.out.println(a.next.next.next.data);      // 10         without using d.

        print(a);

    }

    public static void print(Node head){

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}