import java.util.*;

public class Main {
    public static boolean isSatisfied(int num){
        return num%3==0 || isSubCheck(num);
    }

    public static boolean isSubCheck(int num){
        while(num > 0){
            if(num%10==3 || num%10==6 || num%10==9){
                return true;
            }
            num /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i=a;i<=b;i++){
            if(isSatisfied(i)) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}