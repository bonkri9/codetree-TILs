import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_N = 100000;

    public static int n;
    public static int[] arr = new int[MAX_N];
    public static int[] mergedArr = new int[MAX_N];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        } // 입력 끝

        mergeSort(0, n - 1);

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb.toString().trim());
    }

    public static int[] mergeSort(int low, int high){
        if(low < high){
            int mid = (low + high) / 2;
            mergeSort(low, mid); // 왼쪽 부분 리스트 정렬
            mergeSort(mid + 1, high); // 오른쪽 부분 리스트 정렬
            merge(low, mid, high); // 병합
        }

        return arr;
    }

    public static void merge(int low, int mid, int high){
        int i = low;
        int j = mid + 1;
        int k = low;

        // 두 부분 리스트를 병합
        while(i <= mid && j <= high){
            if(arr[i] <= arr[j]){
                mergedArr[k++] = arr[i++];
            }else{
                mergedArr[k++] = arr[j++];
            }
        }

        // 왼쪽 리스트의 남은 원소들을 복사 
        while(i <= mid){
            mergedArr[k++] = arr[i++];
        }

        // 오른쪽 리스트의 남은 원소들을 복사 
        while(j <= high){
            mergedArr[k++] = arr[j++];
        }

        // 병합된 결과를 원래 배열에 복사 
        for(int l = low; l <= high; l++){
            arr[l] = mergedArr[l];
        }
    }
}