import java.util.Arrays;
public class operations{
    public static void main(String[] args){
        int[] arr = new int[5];        // declaring a array

        int[] myArr = {4,6,9,10,743};   // declaring and initializing....

        
        for(int i=0;i<myArr.length;i++){      // printing all elements of array
            System.out.print(myArr[i]+ " ");
        }

        System.out.println("\nAccessing element using an index");      // Accessing element using an index
        System.out.println("Third element in the array: "+myArr[2]);

        myArr[0] = 100;
        System.out.println("\nupdating Elements: ");                // updating elements..
        System.out.println("update first element: "+myArr[0]);
 

        System.out.println("\nCopying an array");                    // copy a array..
        int[] copyArr = Arrays.copyOf(myArr,myArr.length);
        for(int item : copyArr){
            System.out.print(item + " ");
        }


        System.out.println("\n sorting an Element use of sort()");        // Sorting a array...
        Arrays.sort(myArr);
        for(int item : myArr){
            System.out.print(item + " ");
        }

        System.out.println("\nSearching for an element");
        int index = Arrays.binarySearch(myArr , 100);                    // searching Element...
        if(index >= 0 ){
            System.out.println("Element found at index: "+index);
        }else{
            System.out.println("Element not found");
        }

        System.out.println("\nFilling a array all element to a specific value..");
        Arrays.fill(myArr , 5);                                         // filling a array...
        for(int item : myArr){
            System.out.print(item + " ");
        }

        System.out.println("\nstring representation of an Array..");
        System.out.println(Arrays.toString(myArr));

    }
}