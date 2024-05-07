import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int ab = Integer.parseInt(a + b);
        int ba = Integer.parseInt(b + a);

        System.out.print(ab + ba);
    }
}