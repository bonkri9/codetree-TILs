import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        int cnt1 = 0;
        int cnt2 = 0;

        for(int i=0;i<charArr1.length;i++){
            if(charArr1[i]>=48 && charArr1[i]<=57){
                cnt1++;
            }else{
                break;
            }
        }
        for(int i=0;i<charArr2.length;i++){
            if(charArr2[i]>=48 && charArr2[i]<=57){
                cnt2++;
            }else{
                break;
            }
        }

        str1 = str1.substring(0,cnt1);
        str2 = str2.substring(0,cnt2);
        System.out.printf("%d", Integer.parseInt(str1) + Integer.parseInt(str2));
    }
}