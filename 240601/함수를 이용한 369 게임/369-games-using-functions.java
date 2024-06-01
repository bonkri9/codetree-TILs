import java.util.*;

public class Main {
    public static boolean isSatisfied(int num){
        return num%3==0 || isSubCheck(num);
    }

    public static boolean isSubCheck(int num){
        boolean isRight = false;
        while(num%10!=0){
            int rest = num%10;
            if(rest==3 || rest==6 || rest==9){
                isRight = true;
                break;
            }
            num /= 10;
        }
        return isRight;
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