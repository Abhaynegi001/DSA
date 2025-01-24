class LinkedlistImplementsQueue{

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    static class Queue{
        Node head = null;
        Node tail = null;
        int size = 0;

        void add(int value){
            Node temp = new Node(value);
            if(size == 0){
                head = temp;
                tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        int peek(){
            if(size == 0){
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;
        }

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int remove(){
            if(size == 0){
                System.out.println("queue is empty");
                return -1;
            }
            int x = head.data;
            head = head.next;
            size--;
            return x;
        }
    }
    public static void main(String[] args){
        Queue q = new Queue();
        q.add(1);
        q.add(6);
        q.add(2);
        q.add(4);
        q.add(3);

        q.display();

        q.remove();

        q.display();

        System.out.println("peek element is: "+q.peek());
    }
} 