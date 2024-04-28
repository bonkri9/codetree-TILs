import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] num = new int[1001];

        while(a>0){
            int rest = a % b;
            num[rest]++;
            a /= b;
        }

        int ans = 0;
        for(int i=0;i<num.length;i++){
            if(num[i] != 0){
                ans += num[i] * num[i];
            }
        }
        
        System.out.print(ans);
    }
}