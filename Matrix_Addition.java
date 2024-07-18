public class Matrix_Addition {
    public static void main(String[] args) {
        int arr1[][] = {{1,2},{3,4}};
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }

        int arr2[][] = {{1,2},{3,4}};
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(arr2[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println();


        int addition[][]=new int[2][2];
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                addition[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(addition[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
