import java.util.*;
import java.io.*;

public class Main {
    // public static int cnt = 0;
    // public static int calNum(int num){
    //     if(num == 1){
    //         return cnt;
    //     }

    //     if(num % 2 == 0){
    //         num /= 2;
    //         cnt++;
    //         return calNum(num);
    //     }else{
    //         num /= 3;
    //         cnt++;
    //         return calNum(num);
    //     }
    // }

    public static int calNum(int num){
        if(num == 1){
            return 0;
        }

        if(num % 2 == 0 ){
            return calNum(num / 2) + 1;
        }else{
            return calNum(num / 3) + 1;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.print(calNum(n));
        br.close();
    }
}