import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = new char[100];

        for(int i=0;i<str.length();i++){
            arr[i] = str.charAt(i);
        }

        for(int i=0;i<arr.length;i++){
            if((arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'Z')){
                if((arr[i] >= 'a' && arr[i] <= 'z')){
                    arr[i] = (char)(arr[i] - 'a' + 'A');
                }
                System.out.print(arr[i]);
            }
        }
    }
}