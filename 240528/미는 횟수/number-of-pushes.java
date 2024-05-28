import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int lenA = A.length();
        int cnt = 0;

        while(true){

            cnt++;
            A = A.charAt(lenA-1) + A.substring(0,lenA-1);

            if(A.equals(B)){
                System.out.print(cnt);
                break;
            }
            if(cnt==A.length()){
                System.out.print(-1);
                break;
            }
        }

    }
}