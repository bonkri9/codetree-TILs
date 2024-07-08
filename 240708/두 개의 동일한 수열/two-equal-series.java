import java.util.*;
import java.io.*;

public class Main {
    public static int[] arrA, arrB;
    public static int n;

    public static boolean equal(){
        for(int i=0;i<n;i++){
            if(arrA[i] != arrB[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        
        arrA = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arrA[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrA);

        arrB = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arrB[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrB);

        if(equal()){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}