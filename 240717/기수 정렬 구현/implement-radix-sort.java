import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_N = 100000;
    public static final int MAX_K = 6;
    public static final int MAX_DIGIT = 10;
    
    public static int n;
    public static int[] arr = new int[MAX_N];

    public static void radixSort(){
        int point = 1; // 자릿수
        for(int pos = 0; pos <= MAX_K; pos++){

            // 생성 및 초기화
            ArrayList<Integer>[] arrNew = new ArrayList[MAX_DIGIT];
            for(int i=0;i<MAX_DIGIT;i++){
                arrNew[i] = new ArrayList<>();
            }

            for(int i=0;i<n;i++){
                int digit = (arr[i] / point) % 10;
                arrNew[digit].add(arr[i]);
            }

            int idx = 0;
            for(int i=0;i<MAX_DIGIT;i++){
                for(int j=0;j<arrNew[i].size();j++){
                    arr[idx++] = arrNew[i].get(j);
                }
            }

            point *= 10;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }// 입력 끝

        radixSort();

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(arr[i] + " ");
        }
        System.out.print(sb);
        br.close();
    }
}