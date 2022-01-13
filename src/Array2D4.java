import java.util.Scanner;
public class Array2D4 {
    public static void main(String[] args) {
        int[][] arr1 = new int[2][2];
        int[][] arr2 = new int[2][2];
        Scanner readme = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr1[i][j] = readme.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr2[i][j] = readme.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int s=0;
                for (int k = 0; k < 2; k++) {
                    s=s+arr1[i][k]*arr2[k][j];
                }
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}
