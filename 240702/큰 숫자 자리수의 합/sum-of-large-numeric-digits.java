import java.util.*;
import java.io.*;

public class Main {
    public static int multiNum, sumNum;

    public static int sumCon(int num){
        if(num < 10) return num % 10;

        return sumCon(num / 10) + (num % 10);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        multiNum = 1;
        sumNum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<3;i++){
            multiNum *= Integer.parseInt(st.nextToken());
        }

        System.out.print(sumCon(multiNum));
        br.close();
    }
}