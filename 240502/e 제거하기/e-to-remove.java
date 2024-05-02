import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String str = sc.next();

        for(int i=0;i<str.length();i++){
            if(cnt == 0 && str.charAt(i) == 'e'){
                cnt++;
                continue;
            }
            System.out.print(str.charAt(i));
        }
    }
}