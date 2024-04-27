import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i =n-1;i>=0;i--){
            num[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(num[i]%2==0) System.out.print(num[i]+" ");
        }
    }
}