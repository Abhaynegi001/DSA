import java.util.Arrays;
import java.util.HashSet;
class longestConsecutiveSequence{
    public static void main(String[] args){
        int[] arr = {102,4,100,1,101,3,2,1,1};

        // brute force -                using 2 for loops.
        // brute(arr);

        // better solution.
        // better(arr);

        // optimal solution...
        optimal(arr);
    }

    public static void optimal(int[] arr){

        int n = arr.length;

        int longest = 1;

        HashSet<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {              // this plays a trick .. only count with a starting consecutive number..
                // find consecutive numbers
                int count = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    count = count + 1;
                }
                longest = Math.max(longest, count);
            }
        }
        System.out.print(longest);
    }

    /* public static void better(int[] arr){
        Arrays.sort(arr);

        int count = 0, lastSmallest = Integer.MIN_VALUE, longest = 0;         // simple hai dry run karke dekho simple...

        for(int i=0;i<arr.length; i++){
            if(arr[i]-1 == lastSmallest ){
                count++;
                lastSmallest = arr[i];
            }else if(arr[i]!= lastSmallest){
                count = 1;
                lastSmallest = arr[i];
            }

            longest = Math.max(longest,count);
        }
        System.out.print("Maximum consecutive sequence length is: "+longest);
    } */ 

    /* public static void brute(int[] arr){            // simple hai..
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int x = arr[i];
            int count = 1;

            while(ls(arr,x+1) == true){      // yee tab tk chlega jab tk....isko element milta rhega..
                x = x+1;
                count++;
            }

            max = Math.max(max , count);
        }

        System.out.print("Maximum consecutive sequence length is: "+max);

    }

    public static boolean ls(int[] arr,int num){          // yee check kara hai.. ki x+1 element pure array mai hai ki nhi.. tab true or false dega..
        for(int i=0;i<arr.length;i++){     
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    } */
}