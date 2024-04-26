import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i=0;i<n;i++){
            cnt = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j = a;j<=b;j++){
                if(j%2==0){
                    cnt += j;
                }
            }
            System.out.println(cnt);
        }

    }
}