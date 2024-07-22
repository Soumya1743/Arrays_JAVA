package Arrays_JAVA;

public class Alphabets {
    public static void main(String[] args) {
        char array[] = {'a', 'b', '$', '@', '%', 'S'};
        int alphabets = 0;
        char j = 'A';
        for(char i='a'; i<='z' && j<='Z'; i++, j++){
            for(int k=0; k<6; k++){
                if(array[k]==i || array[k]==j) {
                    alphabets++;
                }
            }
        }
        System.out.println("There are " + alphabets + " Alphabets in the Array");
    }
}
