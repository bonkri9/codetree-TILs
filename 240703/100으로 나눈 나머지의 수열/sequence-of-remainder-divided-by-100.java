import java.util.*;
import java.io.*;

public class Main {
    public static int findNum(int idx){
        if(idx == 1) return 2;
        if(idx == 2) return 4;

        return findNum(idx - 1) * findNum(idx - 2) % 100;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.print(findNum(n));
        br.close();
    }
}