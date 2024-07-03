import java.util.*;
import java.io.*;

public class Main {
    public static int findGCD(int num1, int num2){
        if(num1 % num2 == 0) return num2;

        return findGCD(num2, num1 % num2);
    }

    public static int findLCM(int[] arr){
        if(arr.length == 1) return arr[0];

        int gcd = findGCD(arr[0], arr[1]);
        int lcm = arr[0] * arr[1] / gcd;

        for(int i=2;i<arr.length;i++){
            gcd = findGCD(lcm, arr[i]);
            lcm = lcm * arr[i] / gcd;
        }

        return lcm;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.print(findLCM(arr));
        br.close();
    }
}