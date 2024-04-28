import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        
        for(int i=0;i<n;i++){
            num[i] = sc.nextInt();
        }

        int min = 100;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(i<j){
                    int diff = num[j] - num[i];
                    if(min > diff) min = diff;
                }
            }
        }

        System.out.print(min);
    }
}