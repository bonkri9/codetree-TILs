import java.util.*;
public class Main {
    public static final int MAX = 100;

    public static int n1, n2;
    public static int[] n1Arr = new int[MAX];
    public static int[] n2Arr = new int[MAX];

    // 해당 숫자가 같은 지 판단하는 함수
    public static boolean isSame(int curr){
        for(int i=0;i<n2;i++){
            if(n1Arr[i + curr] != n2Arr[i])
                return false;
        }   
        return true;
    }

    // 연속 수열인 지 판단하는 함수
    public static boolean isSubsequence(){
        for(int i=0;i<=n1 - n2;i++){
            if(isSame(i)) 
                return true;
        }
        return false;
    }

    // 숫자 및 배열 입력 받고 최종으로 나올 Yes, No만 판가름
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        for(int i=0;i<n1;i++){
            n1Arr[i] = sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            n2Arr[i] = sc.nextInt();
        }

        if(isSubsequence()){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}