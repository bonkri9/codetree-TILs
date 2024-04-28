import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        for(int i =0;i<2;i++){
            num[i] = sc.nextInt();
        }
        for(int i=2;i<num.length;i++){
            num[i] = num[i-1] + 2*num[i-2];
        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i] + " ");
        }
    }
}