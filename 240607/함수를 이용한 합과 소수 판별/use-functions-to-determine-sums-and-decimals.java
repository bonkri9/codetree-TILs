import java.util.*;
public class Main {
    public static boolean isSatisfied(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
            if(((num%10) + (num/10)) % 2 != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;
        for(int i=a;i<=b;i++){
            if(isSatisfied(i)) cnt++;
        }

        System.out.print(cnt);
    }
}