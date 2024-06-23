import java.util.*;
import java.io.*;

public class Main {
    public static int calSum(int n){
        if(n == 1) return 1;

        return calSum(n - 1) + n;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        System.out.print(calSum(n));
        br.close();
    }
}