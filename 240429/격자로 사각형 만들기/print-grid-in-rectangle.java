import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == 0 || j == 0) {
                    map[i][j] = 1;
                }else{
                    map[i][j] = map[i-1][j] + map[i][j-1] + map[i-1][j-1];
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}