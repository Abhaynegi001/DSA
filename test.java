class test{
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static class Linkedlist{
        Node head = null;
        Node tail = null;

        void insertAtEnd(int value){
            Node a = new Node(value);
            if(head == null){
                head = a;
            }
            else{
                tail.next = a;
            }
            tail = a;
        }

        void insertAtHead(int value){
            Node temp = new Node(value);
            if(head == null){
                head = temp;
                tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
        }

        void insertAt(int index , int value){
            Node t = new Node(value);
            Node temp = head;

            if(index == size()){       // agar jo index hai vo.. size sa ka equal hai toh..
                insertAtEnd(value);   
                return;
            }else if(index == 0){
                insertAtHead(value);    // agar zero index mai insert krna hai.. toh...
                return;
            }else if(index < 0 || index > size()){       // index galat hoga toh..
                System.out.println("wrong index");
                return;
            }
            for(int i = 1;i<= index-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;

            temp.next = t;
        }

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        int size(){
            Node temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args){
        Linkedlist ll = new Linkedlist();

        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(8);
        ll.insertAtEnd(7);
        ll.insertAtHead(1);
        ll.insertAt(5,10);
        ll.insertAt(9,100);
        ll.display();
        
    }
}