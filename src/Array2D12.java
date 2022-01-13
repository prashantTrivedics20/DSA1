import java.util.Scanner;

// saddle point in the 2D matrix
public class Array2D12 {
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
        for (int i = 0; i < arr.length; i++) {
            int svj=0;
            for (int j = 1; j <arr[0].length ; j++) {
                if(arr[i][j]<arr[i][svj])
                {
                    svj=j;
                }
            }
            boolean s=true;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j][svj]>arr[i][j])
                {
                    s=false;
                }
            }
            if(s==true)
            {
                System.out.println(arr[i][svj]);
                return;
            }
        }
        System.out.println("Invalid input");


    }
}














