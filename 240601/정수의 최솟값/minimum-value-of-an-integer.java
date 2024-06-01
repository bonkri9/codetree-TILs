import java.util.*;
public class Main {
    public static int findMinNum(int a, int b, int c){
        return Math.min(Math.min(a,b),c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(findMinNum(a,b,c));
    }
}