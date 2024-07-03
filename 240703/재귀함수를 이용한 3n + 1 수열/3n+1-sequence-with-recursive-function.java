import java.util.*;
import java.io.*;

public class Main {
    public static int cnt = 0;

    public static int calCnt(int num){
        if(num == 1) return cnt;

        if(num % 2 == 0){
            cnt++;
            return calCnt(num / 2);
        }else{
            cnt++;
            return calCnt(num * 3 + 1);
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.print(calCnt(n));
        br.close();
    }
}