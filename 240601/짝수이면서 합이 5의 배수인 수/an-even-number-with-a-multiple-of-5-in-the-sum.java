import java.util.*;
public class Main {
    public static boolean isCheck(int n){
        return n%2==0 && ((n/10) + (n%10))%5==0;
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