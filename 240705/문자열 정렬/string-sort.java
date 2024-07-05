import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        String sortedStr = new String(arr);
        System.out.print(sortedStr);
    }
}