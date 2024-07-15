import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int[] arr;

    //개선된 버블 정렬
    public static void bubbleSort(){
        boolean sorted = true;

        do{
            sorted = true;
            for(int i=0;i<n-1;i++){
                if(arr[i] > arr[i+1]){
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    sorted = false;
                }
            }
        }while(!sorted);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }// 입력 끝

        bubbleSort();

        // 일반적인 버블정렬
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         if(arr[i] > arr[j]){
        //             int tmp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = tmp;
        //         }
        //     }
        // }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(arr[i] + " ");
        }
        System.out.print(sb);
        br.close();
    }
}