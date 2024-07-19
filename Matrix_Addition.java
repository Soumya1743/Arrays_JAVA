package Arrays_JAVA;
import java.util.*;
public class Matrix_Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of Columns: ");
        int col = sc.nextInt();
        int array1[][] = new int[row][col];
        System.out.print("Enter the elements of array1: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                array1[i][j] = sc.nextInt();
            }
        }

        int array2[][] = new int[row][col];
        System.out.print("Enter the elements of array2: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                array2[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(array1[i][j]+"\t");
            }
            System.out.println();
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(array2[i][j]+"\t");
            }
            System.out.println();
        }

        int addition[][] = new int[2][2];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                addition[i][j] = array1[i][j] + array2[i][j];
                System.out.print(addition[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
