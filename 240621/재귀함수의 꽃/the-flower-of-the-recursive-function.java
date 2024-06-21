import java.util.*;
import java.io.*;

public class Main {
    public static void printNum(int n){
        if(n==0) return;

        System.out.print(n + " ");
        printNum(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printNum(n);
    }
}