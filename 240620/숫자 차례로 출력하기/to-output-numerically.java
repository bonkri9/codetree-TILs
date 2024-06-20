import java.util.*;
public class Main {
    public static void printNum(int n){
        if(n == 0) return;

        printNum(n - 1);
        System.out.print(n + " ");
    }

    public static void printRevNum(int n){
         if(n == 0) return;

        System.out.print(n + " ");
        printRevNum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printNum(n);
        System.out.println();
        printRevNum(n);
    }
}