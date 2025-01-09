import java.util.ArrayList;
class insertionOfSortedArray{
    public static void main(String[] args){
        int[] arr1 = {1,2,2,3,3,4,5,6,7};
        int[] arr2 = {2,3,3,5,6,6,7};

        // brute force approach..
        // bruteforce(arr1,arr2);

        // optimize approach..
        optimize(arr1,arr2);

    }

    public static void optimize(int[] arr1 , int[] arr2){
        int i = 0 , j = 0;
        ArrayList<Integer> insertion = new ArrayList<>();
        while( i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                i++;
            }else if(arr2[j]< arr1[i] ){
                j++;
            }
            else {
                insertion.add(arr1[i]);
                i++; j++;
            }
        } 

        for(int ele : insertion){
            System.out.print(ele + " ");
        }
    }


    /* public static void bruteforce(int[] arr1, int[] arr2){
        int[] visit = new int[arr2.length];                // yee yaad rhkega ..yee element phle aaya toh nhi hai...

        ArrayList<Integer> insertion = new ArrayList<>();

        for(int i=0;i<arr1.length ; i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]== arr2[j] && visit[j] ==0 ){        // isme hmm check kara hai.. dono equal or visit mai aaya toh nhi hai...
                    insertion.add(arr1[i]);
                    visit[j] = 1;
                    break;
                }
                if(arr2[j] > arr1[i]) break;    // arr[j] bada hojya ga mtlb ab nhi hoga kyuki array.. sorted hai..
            }
        }

        for(int ele : insertion){
            System.out.print(ele + " ");
        }
    } */
}