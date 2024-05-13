import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strNum = Integer.toString(sc.nextInt());
        int sum = 0;
        for(int i=0;i<strNum.length();i++){
            sum += strNum.charAt(i) - '0';
        }
        System.out.print(sum);
    }
}