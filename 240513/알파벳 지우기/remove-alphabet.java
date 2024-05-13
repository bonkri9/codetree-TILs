import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr1 = sc.next().toCharArray();
        char[] arr2 = sc.next().toCharArray();

        String str1 = "";
        String str2 = "";
        
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] >= '0' && arr1[i] <= '9'){
                str1 += arr1[i];
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(arr2[i] >= '0' && arr2[i] <= '9'){
                str2 += arr2[i];
            }
        }

        System.out.printf("%d", Integer.parseInt(str1) + Integer.parseInt(str2));

    }
}