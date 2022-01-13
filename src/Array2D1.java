import java.util.Scanner;

public class Array2D1 {
    public static void main(String[] args) {

        Scanner readme=new Scanner(System.in);
        System.out.println("Enter the number of row");
        int n=readme.nextInt();
        System.out.println("Enter the number of column of each rows");
        int m=readme.nextInt();
        int [][]arr=new int[n][m];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=readme.nextInt();
            }
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }


    }
}
