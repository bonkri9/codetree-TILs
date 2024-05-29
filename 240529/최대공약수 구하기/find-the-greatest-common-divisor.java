import java.util.*;
public class Main {
    public static void findNum(int n, int m){
        int ans = 1;
        int small = 1;
        int big = 1;
        if(n>=m){
            small = m;
            big = n;
        }else{
            small = n;
            big = m;
        }
        
        for(int i=1;i<=small/2;i++){
            if(small==big){
                ans = small;
                break;
            }
            if(small%i==0 && big%i==0){
                ans = i;
            }else{
                continue;
            }
        }

        System.out.print(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        findNum(n,m);
    }
}