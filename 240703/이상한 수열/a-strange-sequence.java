import java.util.*;
import java.io.*;

public class Main {
    public static int strangeNum(int idx){
        if(idx == 1) return 1;
        if(idx == 2) return 2;

        return strangeNum(idx / 3) + strangeNum(idx - 1);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.print(strangeNum(n));
        br.close();
    }
}