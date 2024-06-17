import java.util.*;
public class Main {
    public static String str = "";
    public static int numOfAlpha = 1;

    public static void countAlpha(String str){
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i) != str.charAt(i+1)){
                numOfAlpha++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.next();

        countAlpha(str);

        if(numOfAlpha >= 2){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}