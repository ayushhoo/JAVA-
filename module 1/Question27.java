// Question 27: Write a Java program to perform matrix addition and multiplication.
public class Question27 {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};

        int[][] sum = new int[2][2];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                sum[i][j] = a[i][j] + b[i][j];

        int[][] prod = new int[2][2];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    prod[i][j] += a[i][k] * b[k][j];

        System.out.println("Sum:");
        for (int[] row : sum) { for (int v : row) System.out.print(v + " "); System.out.println(); }
        System.out.println("Product:");
        for (int[] row : prod) { for (int v : row) System.out.print(v + " "); System.out.println(); }
    }
}
