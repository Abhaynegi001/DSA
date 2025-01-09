

class setMatrixZero{
    public static void main(String[] args){
        int[][] arr = {
            {1,1,1,1},
            {1,0,0,1},
            {1,1,0,1},
            {1,1,1,1},
        };

        // brute(arr);

        better(arr);

    }

    public static void better(int[][] arr){
        int[] row = new int[4];
        int[] col = new int[4];

        // for tracking which row and column has zero present .. store track on row and col..

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(arr[i][j]==0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // which row and col has zero present it mark as 1.. so its row element replace with a 0.
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(row[i] == 1 || col[j]==1){
                    arr[i][j] = 0;
                }
            }
        }

        
        // print matrix
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

    public static void brute(int[][] arr){

        // search 0 in matrix and that row and column  replace with -1..
        for(int i = 0; i<4; i++){
            for(int j=0; j<4; j++){
                if(arr[i][j] == 0){

                    for(int k = 0;k<4; k++){
                        if(arr[j][k] == 1){
                            arr[j][k] = -1;
                        }
                    }

                    for(int p = 0;p<4; p++){
                        if(arr[p][i] == 1){
                            arr[p][i] = -1;
                        }
                    }
                }
            }
        }

        // replace -1 with 0
        for(int i = 0; i<4; i++){
            for(int j=0; j<4; j++){
                if(arr[i][j]== -1){
                    arr[i][j] = 0;
                }
            }
        }

        // printing the matrixes..
        for(int i = 0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println(" ");
        }
    }
}