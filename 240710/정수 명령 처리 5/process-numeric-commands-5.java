import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrList = new ArrayList<>();

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());

            String commend = st.nextToken();
            
            if(commend.equals("push_back")){
                arrList.add(Integer.parseInt(st.nextToken()));
            }else if(commend.equals("get")){
                System.out.println(arrList.get(Integer.parseInt(st.nextToken()) - 1));
            }else if(commend.equals("size")){
                System.out.println(arrList.size());
            }else if(commend.equals("pop_back")){
                arrList.remove(arrList.size() - 1);
            }
        }

        br.close();
    }
}