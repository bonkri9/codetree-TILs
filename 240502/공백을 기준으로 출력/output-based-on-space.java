import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i) != ' ')
                System.out.print(str1.charAt(i));
        }
        for(int i=0;i<str2.length();i++){
            if(str2.charAt(i) != ' ')
                System.out.print(str2.charAt(i));
        }
    }
}