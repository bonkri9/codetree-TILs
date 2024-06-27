import java.util.*;
import java.io.*;

public class Main {
    public static int calNum(int n){
        if(n < 10) return n * n;


        return calNum(n / 10) + ((n % 10) * (n % 10));
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.print(calNum(n));
    }
}