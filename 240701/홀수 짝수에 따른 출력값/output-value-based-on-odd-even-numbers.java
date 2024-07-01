import java.util.*;
import java.io.*;

public class Main {
    public static int sumNum(int num){
        if(num < 1) return 0;

        return sumNum(num - 2) + num;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.print(sumNum(n));
        br.close();
    }
}