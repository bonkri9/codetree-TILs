import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("* ");
        }
        System.out.println();
        if(n>1){
            for(int j=1;j<=n-1;j++){
                for(int k=1;k<=j;k++){
                    System.out.print("* ");
                }
                for(int l=1;l<=n-1-j;l++){
                    System.out.print("  ");
                }
                System.out.println("*");
            }
        }
    }
}