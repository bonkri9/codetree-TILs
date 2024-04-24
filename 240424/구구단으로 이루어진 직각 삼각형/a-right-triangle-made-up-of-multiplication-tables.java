import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print(i + " * " + j + " = " + (i*j));
                if(j!=n+1-i) System.out.print(" / ");
            }
            System.out.println();
        }
    }
}