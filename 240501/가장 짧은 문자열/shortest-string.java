import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr1 = sc.next().split("");
        String[] arr2 = sc.next().split("");
        String[] arr3 = sc.next().split("");

        int min = Math.min(Math.min(arr1.length, arr2.length), arr3.length);
        int max = Math.max(Math.max(arr1.length, arr2.length), arr3.length);

        System.out.print(max-min);
    }
}