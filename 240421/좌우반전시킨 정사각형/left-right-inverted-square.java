import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>0;j--){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}