import java.util.*;
import java.io.*;

public class Main {
    public static void printStar(int n){
        if(n==0) return;

        printStar(n - 1);
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printStar(n);
    }
}