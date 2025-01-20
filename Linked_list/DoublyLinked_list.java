class DoublyLinked_list{
    public static class Node{
        int data;
        Node next;    // next node address
        Node prev;   // previous node address

        Node(int data){          // constructor.
            this.data = data;
        }
    }

    static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void displayRev(Node tail){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    static void display2(Node random){
        Node temp = random;
        while(temp.prev != null){
            temp = temp.prev;
        }

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node insertAtHead(Node head , int value){
        Node temp = head;
        Node t = new Node(value);

        t.next = temp;
        temp.prev = t;

        return t;
    }

    static void insertAtEnd(Node tail , int value){
        Node temp = tail;
        Node t = new Node(value);

        t.prev = temp;
        temp.next = t;
    }

    static void insertAtInd(Node head , int index , int value){
        Node temp = head;
        Node t = new Node(value);
        for(int i = 1; i<index-1;i++){
            temp = temp.next;
        }

        temp.next.prev = t;
        t.prev = temp;
        t.next = temp.next;
        temp.next = t;
    }

    public static void main(String[] args){
        Node a = new Node(4);
        Node b = new Node(12);
        Node c = new Node(18);
        Node d = new Node(55);
        Node e = new Node(46);

        // addressing
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        // display all nodes with head.
        display(a);

        // display all nodes with tail.
        displayRev(e);

        // display all node with head ..but random node given..
        display2(c);

        Node newHead = insertAtHead(a , 100);
        insertAtEnd(e , 999);
        insertAtInd(a , 2 , 50);

        display(newHead);
    }
}