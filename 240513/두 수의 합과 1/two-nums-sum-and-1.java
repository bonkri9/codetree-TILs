import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String sum = Integer.toString(a + b);
        int cnt = 0;
        for(int i=0;i<sum.length();i++){
            if(sum.charAt(i) == '1'){
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}