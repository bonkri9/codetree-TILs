import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];

        for(int i=0;i<n;i++){
            words[i] = br.readLine();
        }

        Arrays.sort(words);

        for(int i=0;i<n;i++){
            System.out.println(words[i]);
        }
    }
}