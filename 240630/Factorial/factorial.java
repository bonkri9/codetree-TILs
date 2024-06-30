import java.util.*;
import java.io.*;

public class Main {
    public static int factorial(int num){
        if(num <= 1) return 1;

        return factorial(num - 1) * num;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.print(factorial(n));
    }
}