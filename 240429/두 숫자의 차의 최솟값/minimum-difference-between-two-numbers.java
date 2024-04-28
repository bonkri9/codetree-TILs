import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        
        for(int i=0;i<n;i++){
            num[i] = sc.nextInt();
        }

        int min = num[1] - num[0];
        for(int i=2;i<n;i++){
            if(min > num[i] - num[i-1]) min = num[i] - num[i-1];
        }

        System.out.print(min);
    }
}