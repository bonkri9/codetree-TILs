import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alpha = sc.next().charAt(0);

        if(alpha == 'a'){
            System.out.print('z');
        }else{
            System.out.print((char)((int)alpha - 1));
        }
    }
}