import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.next().split("");

        String first = strArr[0];
        String second = strArr[1];

        for(int i=0;i<strArr.length;i++){
            if(strArr[i].equals(second)) strArr[i] = first;
            System.out.print(strArr[i]);
        }
        
    }
}