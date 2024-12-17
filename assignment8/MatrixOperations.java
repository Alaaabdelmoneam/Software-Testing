import java.util.Random;
import java.util.Scanner;

class Matrix {
    private int[][] matrix;

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
}

public class MatrixOperations {

    public static int[][] initializeMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(100) + 1; // Random numbers between 1 and 100
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    public int sumOfElements(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }

    public int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public int findMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

    public int[] countEvenOdd(int[][] matrix) {
        int evenCount = 0;
        int oddCount = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                if (element % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }
        return new int[]{evenCount, oddCount};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of rows and columns from the user
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // Create Matrix object and initialize it
        Matrix matrixObj = new Matrix();
        int[][] matrix = initializeMatrix(rows, cols);
        matrixObj.setMatrix(matrix);

        // Display the matrix
        System.out.println("Original Matrix:");
        displayMatrix(matrixObj.getMatrix());

        // Create an instance to call non-static methods
        MatrixOperations operations = new MatrixOperations();

        // Sum of elements
        int sum = operations.sumOfElements(matrixObj.getMatrix());
        System.out.println("Sum of all elements: " + sum);

        // Transpose the matrix
        int[][] transposed = operations.transposeMatrix(matrixObj.getMatrix());
        System.out.println("Transposed Matrix:");
        displayMatrix(transposed);

        // Find maximum element
        int max = operations.findMax(matrixObj.getMatrix());
        System.out.println("Maximum element in the matrix: " + max);

        // Count even and odd numbers
        int[] evenOddCount = operations.countEvenOdd(matrixObj.getMatrix());
        System.out.println("Count of even numbers: " + evenOddCount[0]);
        System.out.println("Count of odd numbers: " + evenOddCount[1]);

        // Demonstrating call by value and call by reference
        System.out.println("Demonstrating call by value and call by reference:");
        System.out.println("Rows before method call: " + rows);
        modifyValue(rows);
        System.out.println("Rows after method call (unchanged due to call by value): " + rows);

        System.out.println("Matrix before modification:");
        displayMatrix(matrixObj.getMatrix());
        modifyMatrix(matrixObj.getMatrix());
        System.out.println("Matrix after modification (changed due to call by reference):");
        displayMatrix(matrixObj.getMatrix());

        scanner.close();
    }

    // Call by value
    public static void modifyValue(int value) {
        value += 10;
    }

    // Call by reference
    public static void modifyMatrix(int[][] matrix) {
        if (matrix.length > 0 && matrix[0].length > 0) {
            matrix[0][0] = -1; // Modify the first element in the matrix
        }
    }
}
