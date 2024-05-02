import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String command = sc.next();
        int lenStr = str.length();

        for(int i=0;i<command.length();i++){
            if(command.charAt(i) == 'L') str = str.substring(1) + str.substring(0, 1);
            else str = str.substring(lenStr - 1) + str.substring(0, lenStr - 1);
        }

        System.out.print(str);
    }
}