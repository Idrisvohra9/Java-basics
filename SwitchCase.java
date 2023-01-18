import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 to 5:- ");
        int n = input.nextInt();
        switch (n) {
            case 0:
                System.out.println("You entered 0.");
                break;
            case 1:
                System.out.println("You entered 1.");
                break;
            case 2:
                System.out.println("You entered 2.");
                break;
            case 3:
                System.out.println("You entered 3.");
                break;
            case 4:
                System.out.println("You entered 4.");
                break;
            case 5:
                System.out.println("You entered 5.");
                break;
            default:
                System.out.println("Please enter a number in the range.");
                break;
            }
            input.close();
        
    }
}
