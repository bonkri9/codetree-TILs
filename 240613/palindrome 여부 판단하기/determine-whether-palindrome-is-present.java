import java.util.*;
public class Main {
    public static String reverse(String str){
        int strLen = str.length();
        String revStr = "";

        for(int i=strLen-1;i>=0;i--){
            revStr += str.substring(i,i+1);
        }

        return revStr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String revStr = reverse(str);

        if(str.equals(revStr)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}