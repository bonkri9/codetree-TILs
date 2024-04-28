import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] map1 = new int[n][m];
        int[][] map2 = new int[n][m];
        int[][] ans = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                map1[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                map2[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(map1[i][j] != map2[i][j]) ans[i][j] = 1;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
}