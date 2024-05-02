import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.next().split("");
        String[] command = sc.next().split("");
        int lenStr = strArr.length;

        for(int i=0;i<command.length;i++){
            if(command[i].equals("L")){
                String tmp = strArr[0];
                for(int j=1;j<lenStr;j++){
                    strArr[j - 1] = strArr[j];
                }
                strArr[lenStr - 1] = tmp;
                continue;
            }
            if(command[i].equals("R")){
                String tmp = strArr[lenStr - 1];
                for(int j = lenStr - 2; j >= 0; j--){
                    strArr[j + 1] = strArr[j];
                }
                strArr[0] = tmp;
                continue;
            }
        }

        for(int i=0;i<lenStr;i++){
            System.out.print(strArr[i]);
        }
    }
}