package Arrays_JAVA;

public class Matrix_Addition {
    public static void main(String[] args) {
        int array1[][] = {{1,2},{3,4}};
        int array2[][] = {{5,6},{7,8}};
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(array2[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println();

        if(array1.length != array2.length){
            System.out.println("Lengths are not equal, can't do Addition!");
        }
        else{
            int addition[][]=new int[2][2];
            for(int i=0; i<2; i++){
                for(int j=0; j<2; j++){
                    addition[i][j] = array1[i][j] + array2[i][j];
                    System.out.print(addition[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
