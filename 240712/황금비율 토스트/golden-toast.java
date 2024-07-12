import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        LinkedList<String> list = new LinkedList<>();

        String str = br.readLine();
        String[] strArr = new String[n];
        strArr = str.split("");

        for(int i=0;i<n;i++){
            list.add(strArr[i]);
        }

        ListIterator<String> it = list.listIterator(list.size());

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("L")){
                it.previous();
            }else if(command.equals("R")){
                it.next();
            }else if(command.equals("P")){
                it.add(st.nextToken());
            }else{
                it.next();
                it.remove();
            }
        }

        it = list.listIterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }


    }
}