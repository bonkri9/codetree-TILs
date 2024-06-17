import java.util.*;
public class Main {
    public static String str = "";

    // 하나라도 서로 다른 알파벳 있으면 그 문자열은 알파벳 2개 이상.
    public static boolean isMoreTwoAlpha(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != str.charAt(0)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.next();

        if(isMoreTwoAlpha(str)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}