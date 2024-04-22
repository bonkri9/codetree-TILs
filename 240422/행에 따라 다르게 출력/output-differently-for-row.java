import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i =1;i<=n;i++){
            if(i%2==1){
                for(int j = 1;j<=n;j++){
                    cnt++;
                    System.out.print(cnt + " ");
                }
            }else{
                for(int j = 1;j<=n;j++){
                    cnt += 2;
                    System.out.print(cnt + " ");
                }
            }
            System.out.println();
        }
    }
}