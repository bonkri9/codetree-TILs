import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.next().split(":");
        int h = Integer.parseInt(strArr[0]);
        System.out.print((h+1) + ":" + strArr[1]);
    }
}