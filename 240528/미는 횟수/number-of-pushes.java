import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int lenB = B.length();
        int cnt = 0;

        while(true){
            if(A.equals(B)){
                System.out.print(cnt);
                break;
            }
            cnt++;
            if(cnt==B.length()){
                System.out.print(-1);
                break;
            }

            B = B.charAt(lenB-1) + B.substring(0,lenB-1);
        }

    }
}