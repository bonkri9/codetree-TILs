import java.util.*;
import java.io.*;

public class Main {
    public static int n,m;
    public static int[] nums;

    public static int plusByCon(){
        int sum = 0;
        for(int i=1;i<=n;i++){

            sum += nums[m];

            if(m%2==0){
                m /= 2;
            }else{
                m -= 1;
            }

            if(m == 0) break;
        }

        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        nums = new int[n+1];
        for(int i=1;i<n;i++){
            nums[i] = sc.nextInt();
        }

        System.out.print(plusByCon());
    }
}