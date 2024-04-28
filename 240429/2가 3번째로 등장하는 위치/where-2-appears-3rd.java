import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for(int i=0;i<n;i++){
            int input = sc.nextInt();
            if(input == 2) cnt++;
            if(cnt == 3){
                System.out.print(i+1);
                break;
            }
        }
    }
}