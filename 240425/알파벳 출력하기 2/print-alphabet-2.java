import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
        for(int i = 0; i<n;i++){
            for(int j =0; j<i;j++){
                System.out.print("  ");
            }
            for(int k=i;k<n ;k++){
                System.out.print(ch+" ");
                if(ch == 'Z'){
                    ch = 'A';
                }else{
                    ch++;
                }
            }
            System.out.println();
        }
    }
}