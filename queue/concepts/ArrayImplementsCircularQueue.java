class ArrayImplementsCircularQueue{
    
    static class circularQueue{
        int[] arr = new int[6];

        int front = -1;
        int rare = -1;
        int size = 0;
        int n = arr.length;

        void add(int x){
            if(size == arr.length){
                System.out.println("queue is full");
                return;
            }
            else if(size == 0){
                front = rare = 0;
                arr[0] = x;
            }
            else if(rare < n-1){
                arr[++rare] = x;
            }
            else if(rare == n-1){
                rare = 0;
                arr[0] = x; 
            }
            size++;
        }

        int remove(){
            if(size == 0){
                System.out.println("queue is empty");
                return -1;
            }
            else if(front == n-1){
                int val = arr[front];
                front = 0;
                size--;
                return val;
            }
            else{
                int val = arr[front];
                front++;
                size--;
                return val;
            }
        }

        int peek(){
            return arr[rare];
        }


        void display(){
            if(front <= rare){
                for(int i = front; i<=rare; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            if(rare < front){
                for(int i = front; i<=n-1; i++){
                    System.out.print(arr[i] + " ");
                }
                for(int i = 0; i<=rare; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        circularQueue cq = new circularQueue();
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.add(5);
        cq.add(6);

        cq.display();

        System.out.println("peek element is: "+cq.peek());

        cq.remove();

        cq.display();

        cq.add(999);

        cq.display();
    }
}