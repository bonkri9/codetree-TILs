import java.util.*;
public class Main {
    public static boolean isContinue(int curr, int n2, int[] n1Arr, int[] n2Arr){
        for(int i=0;i<n2;i++){
            if(n1Arr[i + curr] != n2Arr[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] n1Arr = new int[n1];
        int[] n2Arr = new int[n2];

        for(int i=0;i<n1;i++){
            n1Arr[i] = sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            n2Arr[i] = sc.nextInt();
        }

        int repeat = n1 - n2 + 1;
        if(n1 < n2) repeat = 100;

        for(int i=0;i<repeat;i++){
            if(n1 < n2){
                System.out.print("No");
                break;
            }
            if(isContinue(i, n2, n1Arr, n2Arr)){
                System.out.print("Yes");
                break;
            }else if(i == repeat - 1){
                System.out.print("No");
            }
        }

    }
}