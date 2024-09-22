import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch(command) {
                case "push": 
                    q.add(Integer.parseInt(st.nextToken()));
                    break;
                case "front":
                    System.out.println(q.peek());
                    break;
                case "size":
                    System.out.println(q.size());
                    break;
                case "empty":
                    System.out.println(q.isEmpty() ? 1 : 0);
                    break;
                case "pop":
                    System.out.println(q.poll());
                    break;
            }

        }
    }
}