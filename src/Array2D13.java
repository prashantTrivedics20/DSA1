import java.util.Scanner;

// search in a shorted 2dArray(by using linear search)
public class Array2D13 {
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
        System.out.println("Enter the element that you want to sort");
        int ele=readme.nextInt();
        int f=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]==ele)
                {

                    System.out.println(i+","+j);
                    return;
                }
            }
        }
        System.out.println("Element is not found");

    }
}
