import java.util.*;

public class SpiralMatrix {
    public static int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return new int[0]; // Return an empty array if the matrix is empty

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] result = new int[rows * cols]; // Initialize result array

        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
        int index = 0; // Index to keep track of the next available position in the result array
        int d=0;
        while (top <= bottom && left <= right) {
            // Traverse top row
            if(d==0){
                for (int i = left; i <= right; i++)
                result[index++] = matrix[top][i];
            top++;
            }
            

            // Traverse rightmost column
            if(d==1){
                for (int i = top; i <= bottom; i++)
                result[index++] = matrix[i][right];
            right--;
            }
            

            // Traverse bottom row (if applicable)
            if (d==2) {
                for (int i = right; i >= left; i--)
                    result[index++] = matrix[bottom][i];
                bottom--;
            }

            // Traverse leftmost column (if applicable)
            if (d==3) {
                for (int i = bottom; i >= top; i--)
                    result[index++] = matrix[i][left];
                left++;
            }
            d=(d+1)%4;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] arr2x2 = {{1, 2}, {3, 4}};
        System.out.println("Sample Input 1: " + Arrays.toString(spiralOrder(arr2x2)));

        int[][] arr3x3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Sample Output 2: " + Arrays.toString(spiralOrder(arr3x3)));
    }
}
