import java.util.ArrayList;
class LeaderInArray{
    public static void main(String[] args){
        int[] arr = {10,22,12,3,0,6};


        // brute force ---          using 2 for loops.
        // brute(arr);

        // optimal solution ---    expalin in note book..
        optimal(arr);
    }

    public static void optimal(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();

        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = n-1; i>= 0; i--){
            if(arr[i] > max){
                max = arr[i];
                ans.add(arr[i]);
            }
        }

        // for printing answer..
        for(int element : ans){
            System.out.print(element + " ");
        }
    }

    /* public static void brute(int[] arr){
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0;i<n;i++){
            boolean leaders = true;
            for(int j = i+1 ; j<n;j++){
                if(arr[i] < arr[j]){
                    leaders = false;
                    break;
                }
            }
            if(leaders){
                ans.add(arr[i]);
            }
        }

        // for printing aswer..
        for(int element : ans){
            System.out.print(element + " ");
        }
    } */
}