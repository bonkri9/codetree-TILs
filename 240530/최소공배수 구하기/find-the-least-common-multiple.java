import java.util.*;
public class Main {
    public static void findLcm(int n, int m){
        int gcm = 1;

        for(int i=1;i<=Math.min(n,m);i++){
            if(n%i==0 && m%i==0){
                gcm = i;
            }
        }

        int lcm = n*m/gcm;
        System.out.print(lcm);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        findLcm(n,m);
    }
}