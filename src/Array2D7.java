import java.util.Scanner;
// rotate the matrix by 90 degree...
public class Array2D7 {
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
        // transpose
        for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr[0].length; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                    //System.out.print(arr[i][j]+" ");
                }
                //System.out.println();
            }
            for (int i = 0; i < arr.length; i++) {
                int li = 0;
                int ri = arr[i].length - 1;
                while (li < ri) {
                    int temp = arr[i][li];
                    arr[i][li] = arr[i][ri];
                    arr[i][ri] = temp;
                    li++;
                    ri--;
                }

            }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }




    }



}
