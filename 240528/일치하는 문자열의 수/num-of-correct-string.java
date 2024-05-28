import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String standard = sc.next();
        int cnt =0;

        for(int i=0;i<n;i++){
            String str = sc.next();
            if(standard.equals(str)) cnt++;
        }

        System.out.print(cnt);
    }
}