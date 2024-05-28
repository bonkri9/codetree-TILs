import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        while(!str.equals("END")){
            String reverse = "";

            for(int i=str.length()-1;i>=0;i--){
                reverse += str.charAt(i);
            }

            System.out.println(reverse);

            str = sc.next();
        }
        
    }
}