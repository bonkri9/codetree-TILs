import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += sc.nextInt();
        }
        String numStr = Integer.toString(sum);
        String ans = "";
        for(int i=1;i<=numStr.length();i++){
            if(i==numStr.length()) ans += numStr.charAt(0);
            else ans += numStr.charAt(i);
        }
        System.out.print(ans);
    }
}