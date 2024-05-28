import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = new String[200];
        int cnt = 0;

        for(int i=0;i<strArr.length;i++){
            strArr[i] = sc.next();
            if(strArr[i].equals("0")){
                System.out.println(cnt);
                break;
            }
            cnt++;
        }

        for(int i=0;i<cnt;i++){
            if(i%2==0) System.out.println(strArr[i]);
        }
    }
}