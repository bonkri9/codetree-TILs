import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.next().split("-");
        System.out.printf("010-%s-%s", strArr[2], strArr[1]);
    }
}