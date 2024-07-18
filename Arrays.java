import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements are there in your array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " Elements: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
    }
}
