import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.next().split("");
        for(int i =strArr.length-1;i>=0;i--){
            if(i%2==1) System.out.print(strArr[i]);
        }
    }
}