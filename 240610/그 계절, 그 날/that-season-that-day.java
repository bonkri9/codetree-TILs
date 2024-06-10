import java.util.*;
public class Main {
    public static int isDayNum(int Y, int M){
        if(M == 2){
            if(isYoonYear(Y)){
                return 29;
            }
            return 28;
        }else if(M == 4 || M == 6 || M == 9 || M == 11){
            return 30;
        }
        return 31;
    }

    public static boolean isYoonYear(int Y){
        if(Y % 4 != 0){
            return false;
        }
        if(Y % 100 != 0){
            return true;
        }
        if(Y % 400 == 0){
            return true;
        }
        return false;
    }

    public static boolean isRightTime(int Y, int M, int D){
        if(D <= isDayNum(Y, M)){
            return true;           
        }
        return false;
    }

    public static void isWhatSeason(int M){
        if(M>=3 && M<=5){
            System.out.print("Spring");
        }else if(M >= 6 && M <= 8){
            System.out.print("Summer");
        }else if(M >= 9 && M <= 11){
            System.out.print("Fall");
        }else{
            System.out.print("Winter");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();

        if(isRightTime(Y,M,D)){
            isWhatSeason( M );
        }else{
            System.out.print("-1");
        }
    }
}