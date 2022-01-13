import java.util.Scanner;

public class Array2D11 {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int m=readme.nextInt();
        int [][]arr=new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=readme.nextInt();
            }
        }
        for (int g = 0; g < arr.length; g++) {
            for (int i = 0, j=g;j<arr.length;i++,j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }

    }

}
