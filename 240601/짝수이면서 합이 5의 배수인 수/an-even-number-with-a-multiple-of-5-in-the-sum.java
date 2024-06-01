import java.util.*;
public class Main {
    public static boolean isCheck(int n){
        int sum = (n%10) + (n/10);
        if(n%2==0 && sum%5==0) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(isCheck(n)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }

    }
}