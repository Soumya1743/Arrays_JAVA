package Arrays_JAVA;
import java.util.*;
public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();
        int array[][] = new int[row][col];
        System.out.println("Enter elements of array: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                array[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Transpose of array is: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(array[j][i]+"\t");
            }
            System.out.println();
        }
    }
}
