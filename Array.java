public class Array {
    public static void main(String[] args) {
        // Creating an array of int data type:
        int[] array ={2,34,5,6,7};
        System.out.println(array[3]);// Output: 6
        System.out.println();
        
        // Iterating through the array:
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            // System.out.print(array[i]);
            // if (i < array.length-1){
            //     System.out.print(",");
            // }
            // else break;
        }
        System.out.println();
        // Second method:
        // For each loop:
        for (int n: array){
            System.out.println(n);
        }
    }
}
