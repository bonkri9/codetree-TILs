import java.util.*;
import java.io.*;

public class Main {
    public static StringTokenizer st;
    public static int n;
    public static int[] nums;

    public static int findMax(int idx){
        if(idx == 0) return nums[0];

        return Math.max(findMax(idx - 1), nums[idx]);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());

        nums = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        System.out.print(findMax(n - 1));
        br.close();
        
    }
}