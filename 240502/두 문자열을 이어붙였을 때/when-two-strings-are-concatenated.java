import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        if((str1+str2).equals(str2+str1)) System.out.print(true);
        else System.out.print(false);

    }
}