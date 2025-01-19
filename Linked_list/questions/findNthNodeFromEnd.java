class findNthNodeFromEnd{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args){
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // System.out.println("Size is: "+size(a));

        // getAt(a,3);                      // function to get the node from the end.... yee 2 traversal mai hora hai..
                                            // 1st find the size and 2nd is finding node from the end..


        fast_slow(a,2);                     // explain in notebook.
    }

    public static void fast_slow(Node head , int index){
        Node slow = head;
        Node fast = head;

        for(int i=1;i<=index;i++){
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        System.out.println("data: "+slow.data);
    }

    public static int size(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void getAt(Node head,int index){
        Node temp = head;
        int last = size(head) - index;
        for(int i = 1; i<=last;i++){
            temp =  temp.next;
        }
        System.out.println("data: "+temp.data);
    }
}