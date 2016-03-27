import java.util.Scanner;

/**
 * Created by Administrator on 2016/3/26.
 */

public class AddDigits {

    public int addDigits(int num) {

        if (num == 0) return 0;
        if (num % 9 == 0) return 9;
        return num % 9;
    }

    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        AddDigits add = new AddDigits();
        System.out.print("Hello World. " + add.addDigits(a));
    }
}
