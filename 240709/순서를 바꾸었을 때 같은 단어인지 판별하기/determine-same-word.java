import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        String second = br.readLine();

        char[] firstArr = first.toCharArray();
        char[] secondArr = second.toCharArray();

        Arrays.sort(firstArr);
        Arrays.sort(secondArr);

        String sortedFirst = new String(firstArr);
        String sortedSecond = new String(secondArr);

        if(sortedFirst.equals(sortedSecond)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}