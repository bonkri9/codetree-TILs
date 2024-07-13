import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 두번째 Solution
        LinkedList<Character> list = new LinkedList<>();

        String str = br.readLine();
        for(char c : str.toCharArray()){
            list.add(c);
        }

        ListIterator<Character> it = list.listIterator(list.size());
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch(command){
                case "L":
                    if(it.hasPrevious()){
                        it.previous();
                    }
                    break;
                case "R":
                    if(it.hasNext()){
                        it.next();
                    }
                    break;
                case "P":
                    it.add(st.nextToken().charAt(0));
                    break;
                case "D":
                    if(it.hasNext()){
                        it.next();
                        it.remove();
                    }
                    break;
            } //switch-case

        } //for

        StringBuilder sb = new StringBuilder();
        list.forEach(sb::append);
        System.out.print(sb);
        br.close();


        // 아래가 첫 solution

        // LinkedList<String> list = new LinkedList<>();
        // String str = br.readLine();
        // String[] strArr = new String[n];
        // strArr = str.split("");

        // for(int i=0;i<n;i++){
        //     list.add(strArr[i]);
        // }

        // ListIterator<String> it = list.listIterator(list.size());

        // for(int i=0;i<m;i++){
        //     st = new StringTokenizer(br.readLine());
        //     String command = st.nextToken();

        //     if(command.equals("L") && it.hasPrevious()){
        //         it.previous();
        //     }else if(command.equals("R") && it.hasNext()){
        //         it.next();
        //     }else if(command.equals("P")){
        //         it.add(st.nextToken());
        //     }else if(command.equals("D") && it.hasNext()){
        //         it.next();
        //         it.remove();
        //     }
        // }

        // it = list.listIterator();
        // while(it.hasNext()){
        //     System.out.print(it.next());
        // }
        // br.close();
    }
}