import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n1:- ");
        int n1 = input.nextInt();
        System.out.print("Enter n2:- ");
        int n2 = input.nextInt();

        String iftrue= n1 + " is the biggest.";
        String iffalse= n2 + " is the biggest.";

        String output = (n1>n2)? iftrue: iffalse;
        System.out.println(output);
        input.close();
    }
}
