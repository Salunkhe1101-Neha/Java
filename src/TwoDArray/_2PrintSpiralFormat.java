
package TwoDArray;
import java.util.Scanner;

public class _2PrintSpiralFormat {

    // Function to print matrix in the specified format
    static void printSpiral(int[][] matrix, int rows, int cols) {
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {
            // Print top to bottom in the leftmost column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][left] + " ");
            }
            left++;

            // Print left to right in the bottom row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[bottom][i] + " ");
            }
            bottom--;

            // Print bottom to top in the rightmost column
            for (int i = bottom; i >= top; i--) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Print right to left in the top row
            for (int i = right; i >= left; i--) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;
        }
    }

    // Driver code
    public static void main(String[] args) {
//        int rows = 3;
//        int cols = 3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row value");
        int rows=sc.nextInt();
        System.out.println("Enter col value");
        int cols=sc.nextInt();
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };

        int[][] matrix =new int[rows][cols];

        System.out.println("Enter elements in matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Given Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSpiral Form in the specified format:");
        printSpiral(matrix, rows, cols);
    }
}

