import java.util.*;
import java.io.*;

public class Main {
    public static int n,m;
    public static int[] nums;

    public static int plusByCon(){
        int sum = 0;
        while(m >= 1){

            sum += nums[m];

            if(m%2==0){
                m /= 2;
            }else{
                m -= 1;
            }

        }

        return sum;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        nums = new int[n+1];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=1;i<n;i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        System.out.print(plusByCon());
    }
}