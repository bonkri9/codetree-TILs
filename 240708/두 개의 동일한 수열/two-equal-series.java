import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        int[] arrA = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arrA[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrA);

        int[] arrB = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arrB[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrB);

        boolean checkSame = false;

        for(int i=0;i<n;i++){
            if(arrA[i] != arrB[i]){
                break;
            }
            if(i == n-1) checkSame = true;
        }

        if(checkSame){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}