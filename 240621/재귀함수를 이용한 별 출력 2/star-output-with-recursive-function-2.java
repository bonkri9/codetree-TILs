import java.util.*;
import java.io.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();


    public static void printStar(int n){
        if(n==0) return;

        for(int i=0;i<n;i++){
            sb.append("* ");
        }
        sb.append("\n");

        printStar(n - 1);

        for(int i=0;i<n;i++){
            sb.append("* ");
        }
        sb.append("\n");

    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        printStar(n);

        System.out.print(sb);
        br.close();
    }
}