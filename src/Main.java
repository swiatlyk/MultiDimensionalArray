import java.util.Scanner;

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
        System.out.println("Displaying first row and second column: " + array[0][1]);

        int[][] array2 = {
                {4, 15, 17},
                {2, 154, 170},
                {41, 125, 174},
                {23, 345, 657}
        };
        System.out.println("Displaying forth row and first column: " + array[3][0]);

        //Autofill and print the array
        int[][] autoArray = new int[5][4];
        int row = (autoArray.length);
        int col = (autoArray[0].length);

        for (int x = 0; x < row; x++) {
            for (int z = 0; z < col; z++) {
                int arrValue = x + z;
                autoArray[x][z] = arrValue;
                if (arrValue < 10) {
                    System.out.print(arrValue + "\t");
                } else {
                    System.out.print("\n");
                }
            }
            System.out.println();
        }

        //Provide info about array, how may rows and columns
        Scanner inputer = new Scanner(System.in);
        int rowManu = 0;
        int colManu = 0;
        System.out.println("How many row's: ");
        rowManu = inputer.nextInt();
        System.out.println("How many columns: ");
        colManu = inputer.nextInt();
        System.out.println("Will use " + row + " rows and " + col + " colums in array");
        int[][] manuArray = new int[row][col];

        for (int w = 0; w < rowManu; w++) {
            for (int u = 0; u < colManu; u++) {
                int arrValue = w + u;
                manuArray[w][u] = arrValue;
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
