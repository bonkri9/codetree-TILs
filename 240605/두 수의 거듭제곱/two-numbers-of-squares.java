import java.util.*;
public class Main {
    public static int calMutli(int a, int b){
        int ans = 1;
        for(int i=0;i<b;i++){
            ans *= a;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(calMutli(a, b));
    }
}