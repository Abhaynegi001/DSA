import java.util.*;

class implementation{
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();

        // add the element in queue.
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        // print the queue.
        System.out.println(q);
        
        // remove the element.
        q.remove();
        System.out.println(q);

        // peek element in queue.
        System.out.println("peek element in queue: "+q.peek());

        // size
        System.out.println("size of the element: "+q.size());
    }
}