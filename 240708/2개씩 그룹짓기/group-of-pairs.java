import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[2*n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<2*n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int max = 0;
        for(int i=0;i<n;i++){
            if(max < arr[i]+arr[2*n-1-i]){
                max = arr[i]+arr[2*n-1-i];
            }
        }

        System.out.print(max);
    }
}