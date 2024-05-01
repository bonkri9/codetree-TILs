import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr1 = sc.nextLine().split(" ");
        String[] arr2 = sc.nextLine().split(" ");

        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]);
        }
    }
}