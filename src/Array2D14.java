import java.util.Scanner;
// search in 2D array by using Binary search....
public class Array2D14 {
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
        int x=readme.nextInt();
        int i=0;
        int j=arr[0].length-1;
        while(i<arr.length&&j>=0)
        {
            if(x==arr[i][j])
            {
                System.out.println(i+" "+j);
                return;
            }
            else if(x<arr[i][j])
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        System.out.println("not found");
    }

}
