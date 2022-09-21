import java.util.*;

public class Pra_4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 or 2: ");
        int a = sc.nextInt();
        try{
            switch(a){
                case 1:
                    System.out.println(10/0);
  break;
                case 2:
                    int[] arr = new int[2];
                    System.out.println(arr[3]);
                    break;
            }
        }
        catch(ArithmeticException e){
            System.out.println("There is an ArithmeticExecption");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("There is an ArrayIndexOutOfBoundsException");
        }
        finally{
            System.out.println("The program is over, Thank you!");
        }
    }
}
