import java.util.Scanner;
public class MatrixAddition
{
public static void main(String[] args)
{
System.out.println("--- Experiment 5: Matrix Addition ---");
Scanner scanner = new Scanner(System.in);
int rows = 3;
int cols = 3;
System.out.println("Adding two " + rows + "x" + cols + " matrices.");
int[][] matrixA = new int[rows][cols];
int[][] matrixB = new int[rows][cols];
int[][] sumMatrix = new int[rows][cols];
System.out.println("\nEnter elements of Matrix A (" + rows + "x" + cols + "):");
readMatrix(scanner, matrixA, rows, cols);
System.out.println("\nEnter elements of Matrix B (" + rows + "x" + cols + "):");
readMatrix(scanner, matrixB, rows, cols);
for (int i = 0; i < rows; i++)
{
for (int j = 0; j < cols; j++)
{
sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
}
}
System.out.println("\n--- Resultant Matrix (A + B) ---");
printMatrix(sumMatrix, rows, cols);
scanner.close();
}
public static void readMatrix(Scanner scanner, int[][] matrix, int rows, int cols)
{
for (int i = 0; i < rows; i++)
{
for (int j = 0; j < cols; j++)
{
System.out.print("Enter element at [" + i + "][" + j + "]: ");
matrix[i][j] = scanner.nextInt();
}
}
}
public static void printMatrix(int[][] matrix, int rows, int cols)
{
for (int i = 0; i < rows; i++)
{
for (int j = 0; j < cols; j++)
{
System.out.print(matrix[i][j] + "\t");
}
System.out.println();
}
}
}
