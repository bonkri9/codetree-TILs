import java.util.*;
import java.io.*;

public class Main {
    public static int n, m;
    public static int[] arr;
    public static int[] prefixSum;
    public static StringTokenizer st;
    public static BufferedReader br;

    public static void calculatePrefixSum() {
        prefixSum = new int[n + 1];  // 크기를 n+1로 설정하여 편의상 prefixSum[0] = 0
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        }
    }

    public static void printSum() throws IOException {
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;

            int sum = prefixSum[end + 1] - prefixSum[start];
            System.out.println(sum);
        }
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        calculatePrefixSum();  // 구간 합 배열 계산
        printSum();
        
        br.close();
    }
}