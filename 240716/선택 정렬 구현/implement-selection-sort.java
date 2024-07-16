import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int[] arr;

    public static void selectedSort(){
        for(int i=0;i<n;i++){
            int minIdx = i;

            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minIdx])
                    minIdx = j;
            }

            int tmp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = tmp;
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

        selectedSort();

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}