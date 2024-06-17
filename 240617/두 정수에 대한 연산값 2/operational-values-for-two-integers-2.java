import java.util.*;

class IntWrapper {
    int value;

    public IntWrapper(int value){
        this.value = value;
    }
}

public class Main {
    // call by reference를 구현
    public static void calculate(IntWrapper a, IntWrapper b){
        if(a.value > b.value){
            a.value *= 2;
            b.value += 10;
        }else{
            a.value += 10;
            b.value *= 2;
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        IntWrapper aWrapper = new IntWrapper(a);
        IntWrapper bWrapper = new IntWrapper(b);

        calculate(aWrapper, bWrapper);

        a = aWrapper.value;
        b = bWrapper.value;

        System.out.print(a + " " + b);
    }
}