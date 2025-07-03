import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] strArr = s.split("\\.");
        System.out.print(strArr[1] + "-" + strArr[2] + "-" + strArr[0]);
    }
}