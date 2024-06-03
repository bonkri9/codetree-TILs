import java.util.*;
public class Main {
    public static boolean isPrime(int num){
        if(num==1) return false;
        
        for(int i = 2;i<num;i++){
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;
        for(int i=a;i<=b;i++){
            if(isPrime(i)) sum += i;
        }

        System.out.print(sum);
    }
}