import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        double sumOfLength = 0;
        String[][] strArr = new String[n][20];

        for(int i=0;i<n;i++){
            strArr[i] = sc.next().split("");
        }

        String str = sc.next();

        for(int i=0;i<n;i++){
            if(strArr[i][0].equals(str)){
                cnt++;
                sumOfLength += strArr[i].length;
            }
        }

        System.out.printf("%d %.2f", cnt, sumOfLength / cnt);
    }
}