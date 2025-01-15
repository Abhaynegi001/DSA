class class_automaticImplement{
    
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

        void insertAtEnd(int val){
            Node temp = new Node(val);  // creating a new node..

            if(head==null){             // if head is null than new node is head..
                head = temp;
            }
            else{
                tail.next = temp;      // if head not equal to null.. than last node take the address of new node..
            }
            tail = temp;               // and in last..   new node is tail...
        }

        void insertAtHead(int value){
            Node temp = new Node(value);
            if(head == null){        // if head is null that means.. linked list is empty.. so new node is head or tail..
                head = temp;
                tail = temp;
            }else{                  // if head is present than. new node store the address of. previous head. and become new head himself..
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

        int getAt(int index){
            Node temp = head;
            if(index < 0 || index > size()){
                System.out.print("\nwrong index to get value..");
                return -1;
            }
            for(int i=1;i<=index;i++){
                temp = temp.next;
            }

            return temp.data;
        }

        void delete(int index){
            if(index == 0){       // agar head ko delete krna hoga toh.. head next wala baan jayega..
                head = head.next;
                return;
            }
            Node temp = head;
            for(int i=1;i<=index-1;i++){
                temp = temp.next;
            }
            if(index == size()-1) {      // agar last wala index delete hoga toh.. tail shift krne ka liya..
                tail = temp;           
            }
            temp.next = temp.next.next;
        }

        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        int size(){
            int count = 0;
            Node temp = head;
            while(temp != null){
                count++;
                temp = temp.next;
            }

            return count;
        }

    }

    public static void main(String[] args){
        Linkedlist ll = new Linkedlist();
        ll.insertAtHead(1);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtHead(100);
        ll.insertAt(3,2);
        ll.display();
        ll.delete(2);
        System.out.println();
        ll.display();
        System.out.println("tail is: "+ ll.tail.data);
        // System.out.println("\nget at function: "+ll.getAt(-1));
    }

}