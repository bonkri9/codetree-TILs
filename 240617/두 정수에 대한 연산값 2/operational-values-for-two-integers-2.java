import java.util.*;
public class Main {
    public static String calculate(int a, int b){
        if(a > b){
            a *= 2;
            b += 10;
        }else{
            a += 10;
            b *= 2;
        }
        return a + " " + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(calculate(a, b));
    }
}