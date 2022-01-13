// shell travarsal (it is not completed some issue in this code ....
import java.util.Scanner;
public class Array2D9 {
//    public static void rotateShell ( int[][] arr, int s, int r)
//    {
//        int[] oned = fillOnedFromShell(arr, s);
//        rotate(oned, r);
//        fillOnedFromShell(arr, s, oned);
//    }


    public static void rotate ( int[] oned, int r)
    {

        if (r < 0) {

        }

    }
    public static void display ( int[][] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner readme = new Scanner(System.in);
        int n = readme.nextInt();
        int m = readme.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = readme.nextInt();
            }
        }
        int s = readme.nextInt();
        int r = readme.nextInt();
        //rotateShell(arr, s, r);
        display(arr);



    }
}

