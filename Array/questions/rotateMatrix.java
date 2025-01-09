class rotateMatrix{
    public static void main(String[] args){
        int[][] arr= {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        // brute(arr);

        better(arr);
    }

    public static void better(int[][] arr){

        // first transpose..
        for(int i =0; i<3; i++){
            for(int j = i+1; j<=3; j++){
                int c = arr[i][j];
                arr[i][j] = arr[j][i];       // swap..
                arr[j][i] = c; 
            }
        }

        // reverse.. the element of row..
        for(int i=0; i<4; i++){
            int start = 0;
            int end = 3;

            while(start <= end){
                int c = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = c;

                start++;
                end--;
            }
        }

        // printing the matrix..
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }


    public static void brute(int[][] arr){
        int[][] ans = new int[4][4];

        // for rotate the array..  place the arr element into ans array..

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                ans[j][(4-1)-i] = arr[i][j];
            }
        }

        // for printing the matrix..

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(ans[i][j] + "  ");
            }
            System.out.println(" ");
        }


    }
}