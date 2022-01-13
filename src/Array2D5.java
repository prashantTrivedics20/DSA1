// wave Traversal.......
import java.util.Scanner;
public class Array2D5 {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int m=readme.nextInt();
        int [][]arr=new int[n][m];
        System.out.println(arr.length);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                arr[i][j]=readme.nextInt();
            }
        }
        for (int i = 0; i < arr[0].length; i++) {
            if(i%2==0)
            {
                for (int j = 0; j < arr.length; j++) {
                    System.out.println(arr[j][i]);
                }
            }
            else
            {
                for (int j =arr.length-1;j>=0;j--) {
                    System.out.println(arr[j][i]);

                }
            }
        }
    }
}
