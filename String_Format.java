import java.util.Scanner;
public class String_Format {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter a number: ");
        String arm_s = input.next();

        int arm_i = Integer.parseInt(arm_s);//the parseInt() function finds and returns a decimal number from a string.

        System.out.println(String.format("The number is %d (The length of number in digit: %d)", arm_i, arm_s.length()));//The String.format() function makes the sout statements of java work more like printf() statements of C.
        input.close();
    }
}