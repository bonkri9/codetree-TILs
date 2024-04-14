import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n + 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print("* ");
            }
            System.out.println();
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}