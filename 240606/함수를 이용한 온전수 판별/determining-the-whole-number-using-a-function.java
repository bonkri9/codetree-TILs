import java.util.*;
public class Main {
    public static boolean isOnjeon(int num){
        if(num%2==0) return false;
        if(num%10==5) return false;
        if(num%3==0 && num%9!=0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i = a;i<=b;i++){
            if(isOnjeon(i)) cnt++;
        }

        System.out.print(cnt);
    }
}