import java.util.Scanner;

public class Main {
    public static int findGcd(int n, int m) {
        int ans = 0;
        int min = 0;

        if(n <= m) {
            min = n;
        } else {
            min = m;
        }

        for (int i = 1; i <= min; i++) {
            if(n % i == 0 && m % i == 0) {
                ans = i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        System.out.print(findGcd(n, m));
    }
}