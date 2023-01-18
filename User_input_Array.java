import java.util.Scanner;
public class User_input_Array {
    public static void main(String[] args) {
        System.out.print("Enter the lenght of array for generating: ");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        int arr[] = new int[length];
        System.out.println("The lenght of the array: "+ arr.length);
        System.out.println("Enter values: ");
        
        // Getting the values into the array:
        for (int i = 0; i < length; i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Array created= ");
        System.out.print("{");
        for (int j = 0; j < length; j++){
            System.out.print(arr[j]);
            if (j < arr.length-1) System.out.print(",");
            else break;
        }
        System.out.print("}");
    }
}
