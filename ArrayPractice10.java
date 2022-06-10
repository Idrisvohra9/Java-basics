import java.util.Scanner;

public class ArrayPractice10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Length: ");
        int n= sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements: ");

        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }
        int temp;
        // Sorting the array in ascending order first:
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        int largest=array[array.length-1],
        smallest=array[0],
        second_smallest=array[1];
        System.out.println("Maximum difference: "+ (largest-smallest));
        System.out.println("Minimum difference: "+(second_smallest-smallest));
    }
}