import java.util.*;
public class pra_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("There is an ArithmeticExecption");
        }
        int a[] = new int[3];
        try {
            for (int i = 0; i < 4; i++) {
                a[i] = sc.nextInt();
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("There is an ArrayIndexOutOfBoundsException");
        }
    }
}
