import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr1 = sc.next().split("");
        String[] strArr2 = sc.next().split("");
        int cnt = 0;

        for(int i = 0; i < strArr1.length - 1; i++){
            if(strArr1[i].equals(strArr2[0]) && strArr1[i+1].equals(strArr2[1])){
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}