import java.util.*;
import java.io.*;

public class Main {
    public static String text, pattern;

    public static boolean isSubStr(int startIdx){
        int textLen = text.length();
        int patternLen = pattern.length();

        // 전체 text 문자열 길이보다 
        // 탐색해야할 길이가 더 길면
        // false 반환
        if(startIdx > textLen - patternLen){
            return false;
        }

        for(int i=0;i<patternLen;i++){
            // 한 글자라도 다르면, false 반환
            if(text.charAt(startIdx + i) != pattern.charAt(i)){
                return false;
            }
        }

        // 모두 같으면 반복문 마쳤으므로 true 반환
        return true;
    }



    // 타겟 문자열 돌기
    // 부분 문자열의 인덱스 반환
    public static int findIdx(){
        int textLen = text.length();

        for(int i=0;i<textLen;i++){
            // i번째를 시작으로 부분 문자열 만족하면, 해당 인덱스 반환
            // 만족하지 않으면 계속 반복문 진행 
            if(isSubStr(i)){
                return i;
            }
        }

        // 없으면 -1 반환
        return -1;
    }

    public static void main(String[] args) throws IOException{
        // 변수 선언 및 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        text = br.readLine();
        pattern = br.readLine();

        // return된 인덱스 출력
        System.out.print(findIdx());
    }
}