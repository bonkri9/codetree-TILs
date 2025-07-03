public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int tmp;
        
        tmp = a;
        a = b;
        b = tmp;

        System.out.printf("%d\n%d", a, b);
    }
}