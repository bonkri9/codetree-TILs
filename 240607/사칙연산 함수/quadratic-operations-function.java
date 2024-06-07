import java.util.*;
public class Main {
    public static int calPlus(int a, int c){
        return a + c;
    }

    public static int calMinus(int a, int c){
        return a - c;
    }

    public static int calDivide(int a, int c){
        return a / c;
    }

    public static int calMultiple(int a, int c){
        return a * c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String o = sc.next();
        int c = sc.nextInt();

        int ans = 0;
        if(o.equals("+")){
            ans = calPlus(a, c);
        }else if(o.equals("-")){
            ans = calMinus(a, c);
        }else if(o.equals("/")){
            ans = calDivide(a, c);
        }else if(o.equals("*")){
            ans = calMultiple(a, c);
        }

        System.out.print(a+" "+o+" "+c+" = "+ans);
    }
}