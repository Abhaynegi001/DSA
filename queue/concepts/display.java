
import java.util.*;
class display{
    public static void main(String[] args){
        Queue<Integer> first = new LinkedList<>();
        first.add(1);
        first.add(2);
        first.add(3);
        first.add(4);

        Queue<Integer> sec = new LinkedList<>();

        // element print hogye or sath hi sath sec queue mai chle gya.
        System.out.print("print the element: ");
        while(first.size() != 0 ){
            System.out.print(first.peek() + " ");
            sec.add(first.remove());
        }
        System.out.println();
        System.out.println("sec queue element: "+sec);
        System.out.println("first queue element: "+first);

        // ab firse sec queue sa first queue mai element dalega.
        while(sec.size() != 0 ){
            first.add(sec.remove());
        }

        System.out.println("first queue element: "+first);
    }
}