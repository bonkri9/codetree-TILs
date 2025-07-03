public class Main {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7;
        int tmp = a;
        a = c;
        c = tmp;

        tmp = c;
        c = b;
        b = tmp;

        System.out.printf("%d\n%d\n%d", a, b, c);
    }
}