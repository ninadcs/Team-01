import java.util.Scanner;

public class Modulus {
    public static void main(String args[]) {

        Scanner myobj = new Scanner(System.in);

        int a, b = 0;
        int result=0;

        System.out.println("Enter the dividend");
        a = myobj.nextInt();
        System.out.println("Enter the divisor");
        b = myobj.nextInt();
result=a%b;
        System.out.println("remainder=" + result);
    }
}
