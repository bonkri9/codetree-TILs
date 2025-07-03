import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] date = sc.next().split("-");
        System.out.printf("%s.%s.%s", date[2], date[0], date[1]);
    }
}