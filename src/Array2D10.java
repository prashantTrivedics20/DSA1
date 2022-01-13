// diagonal rotations.....
import java.util.Scanner;
public class Array2D10 {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int m=readme.nextInt();
        int [][]arr=new int[n][m];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=readme.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i==j)
                {
                    System.out.println(arr[i][j]+" ");
                }

            }
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    if (j == i+1+k) {
                        System.out.println(arr[i][j]+" ");
                    }

                }


            }
        }
    }
}
