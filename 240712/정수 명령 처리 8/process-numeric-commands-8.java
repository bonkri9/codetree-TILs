import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        LinkedList<Integer> list = new LinkedList<>();

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if(cmd.equals("push_front")){
                int num = Integer.parseInt(st.nextToken());
                list.addFirst(num);
            }else if(cmd.equals("push_back")){
                int num = Integer.parseInt(st.nextToken());
                list.addLast(num);
            }else if(cmd.equals("pop_front")){
                System.out.println(list.pollFirst());
            }else if(cmd.equals("pop_back")){
                System.out.println(list.pollLast());
            }else if(cmd.equals("size")){
                System.out.println(list.size());
            }else if(cmd.equals("empty")){
                System.out.println((list.isEmpty()) ? 1 : 0);
            }else if(cmd.equals("front")){
                System.out.println(list.peekFirst());
            }else{
                System.out.println(list.peekLast());
            }
        }

    }
}