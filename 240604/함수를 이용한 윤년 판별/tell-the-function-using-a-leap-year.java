import java.util.*;
public class Main {
    public static boolean isYoon(int year){
        if(year%400!=0 && year%100==0)
            return false;
        if(year%4==0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        if(isYoon(y)) System.out.print(true);
        else System.out.print(false);
    }
}