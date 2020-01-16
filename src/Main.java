public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Multi-dimensional array");
        /*
        -------------------------------------
        arr[0][0] | arr [0][1] | arr[0][2] |
        -------------------------------------
        -------------------------------------
        arr[1][0] | arr [1][1] | arr[1][2] |
        -------------------------------------
        -------------------------------------
        arr[2][0] | arr [2][1] | arr[2][2] |
        -------------------------------------
        -------------------------------------
        arr[3][0] | arr [3][1] | arr[3][2] |
        -------------------------------------
        */

        int[][] array = new int[4][3];
        array[0][1] = 25;
        System.out.println(array[0][1]);

        int[][] array2 = {
                {4, 15, 17},
                {2, 154, 170},
                {41, 125, 174},
                {23, 345, 657}
        };
        System.out.println(array2[3][0]);

        //Autofill and print the array
        int[][] autoArray = new int[5][4];
        int a = (autoArray.length);
        int b = (autoArray[0].length);

        for (int x = 0; x < a; x++) {
            for (int z = 0; z < b; z++) {
                int arrValue = x+z;
                autoArray[x][z] = arrValue ;
                if (arrValue < 10) {
                    System.out.print(arrValue + "\t");
                } else {
                    System.out.print("\n");
                }
            }
            System.out.println();
        }
    }
}
