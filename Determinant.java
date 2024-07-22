package Arrays_JAVA;
import java.util.*;
public class Determinant {
    public static void main(String[] args) {
//        int array[][] = {{1,2}, {3,4}};
//        for(int i=0; i<2; i++){
//            for(int j=0; j<2; j++){
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        int det = (array[0][0]*array[1][1]) - (array[0][1]*array[1][0]);
//        System.out.println("Determinant is: " + det);


        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of rows: ");
//        int rows = sc.nextInt();
//        System.out.println("Enter the number of columns:");
//        int col = sc.nextInt();
        int array[][] = new int[3][3];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                array[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(array[i][j] +"\t");
            }
            System.out.println();
        }

        int a = (array[1][1]*array[2][2])-(array[1][2]*array[2][1]);
        int b = (array[1][0]*array[2][2])-(array[2][0]*array[1][2]);
        int c = (array[1][0]*array[2][1])-(array[2][0]*array[1][1]);

        int det = (array[0][0]*a)-(array[0][1]*b)+(array[0][2]*c);
        System.out.println(det);
    }
}
