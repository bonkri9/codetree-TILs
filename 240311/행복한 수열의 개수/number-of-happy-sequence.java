import java.util.*;

public class Main {
    public static int MAX_N = 100;
    public static int n, m;
    public static int[][] map = new int[MAX_N][MAX_N];
    public static int[] arrNum = new int[MAX_N];

    public static boolean checkCondition(){
        
        int continueCnt = 1; //같은 숫자의 연속된 횟수
        int maxContinueCnt = 1; //한 줄에서 가장 많이 연속된 횟수
        for(int i=1;i<n;i++){
            if(arrNum[i-1] == arrNum[i]){
                continueCnt++;
            }else{
                continueCnt = 1;
            }

            maxContinueCnt = Math.max(maxContinueCnt, continueCnt);
        }

        return maxContinueCnt >= m;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                map[i][j] = sc.nextInt();
            }
        }//입력 끝

        int cnt = 0;

        //가로 조건 확인
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arrNum[j] = map[i][j];
            }
            if(checkCondition()) cnt++;
        }

        //세로 조건 확인
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                arrNum[i] = map[i][j];
            }
            if(checkCondition()) cnt++;
        }

        System.out.print(cnt);

    }
}