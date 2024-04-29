import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] map = new int[n][n];

        for(int i=0;i<m;i++){
            int row = sc.nextInt();
            int col = sc.nextInt();

            map[row - 1][col - 1] = row * col;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}