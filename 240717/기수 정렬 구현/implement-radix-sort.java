import java.util.*;
import java.io.*;

public class Main {
    public static int n, pos;
    public static int[] arr;

    public static void radixSort(){
        for(pos = 1; pos <= 6; pos++){

            // 생성 및 초기화
            ArrayList<Integer>[] arr_new = new ArrayList[10];
            for(int i=0;i<arr_new.length;i++){
                arr_new[i] = new ArrayList<Integer>();
            }

            for(int i=0;i<n;i++){
                int tmp = arr[i];
                for(int j=1;j<pos;j++){
                    tmp /= 10;
                }
                int digit = tmp % 10;
                arr_new[digit].add(arr[i]);
            }

            int[] store_arr = new int[n];
            int idx = 0;
            for(int i=0;i<arr_new.length;i++){
                for(int j=0;j<arr_new[i].size();j++){
                    store_arr[idx] = arr_new[i].get(j);
                    idx++;
                }
            }

            arr = store_arr;

        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // pos는 자릿수, 문제에서 원소값의 최대 자릿수는 6
        pos = 6;

        radixSort();

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(arr[i] + " ");
        }
        System.out.print(sb);
        br.close();
    }
}