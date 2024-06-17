import java.util.*;
public class Main {
    public static String target = "";
    public static String object = "";

    public static int findIdx(){
        for(int i=0;i<=target.length() - object.length();i++){
            for(int j=0;j<object.length();j++){
                if(target.charAt(i+j) != object.charAt(j)){
                    break;
                }
                if(j == object.length()-1) return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        target = sc.next();
        object = sc.next();

        System.out.print(findIdx());

    }
}