class ArrayImplementsQueue{

    static class queue{
        int[] arr = new int[20];
        int n = arr.length;
        int front = 0 , rare = 0 , size = 0;

        void add(int value){
            if(rare == n-1){
                System.out.println("queue size is full");
                return;
            }
            arr[rare] = value;
            rare++;
            size++;
        }

        void peek(){
            System.out.println("peek element is: "+arr[front]);
        }

        void display(){
            for(int i=front;i<rare;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        void size(){
            System.out.println("Size is: "+ size);
        }

        int remove(){
            int x = arr[front];
            front++;
            size--;
            return x;
        }
    }

    public static void main(String[] args){
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        q.display();

        q.peek();

        q.remove();

        q.display();

        q.add(56);

        q.display();

        q.size();
    }
}