import java.util.*;
import java.io.*;

public class Main {
    public static int n,m;
    public static int[] arr;
    public static StringTokenizer st;
    public static BufferedReader br;

    public static void printSum() throws IOException{
        for(int i=0;i<m;i++){
            int sum = 0;

            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;

            for(int j=start;j<=end;j++){
                sum += arr[j];
            }

            System.out.println(sum);
        }
    }

    public static void main(String[] args) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        printSum();
        
    }
}