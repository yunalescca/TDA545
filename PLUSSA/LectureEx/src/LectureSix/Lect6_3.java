package LectureSix;

/**
 * Created by Yunalescca on 2017-07-05.
 * Creates a matrix out of a quadratic array
 */
public class Lect6_3 {

    int[][] matrix;
    int row, col;

    public int[][] toMatrix(int[] arr, int row, int col){

        matrix = new int[row][col];
        this.row = row;
        this.col = col;

        int arrayIndex = 0;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix[i][j] = arr[arrayIndex];
                arrayIndex++;
            }
        }

        return matrix;
    }

    public void printMatrix(){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
