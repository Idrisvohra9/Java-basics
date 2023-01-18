public class MultiDimensional_Array {
    public static void main(String[] args) {
        // An 2d int array with two places that can store 2 int arrays with two places
        // a 2d array has 2 parameters: 1. rows and 2.columns.
        int[][] arr= new int[2][2];

        // We can define the size of the content in the array like:
        arr[0] = new int[2]; // first array stores two ints.
        arr[1] = new int[2]; // second array stores two ints.

        // it can be increased or decreased it is called jagging an array.
        // Seeing with the point of view of a python dictionary makes it easier.
        // For example arr={{0,1},{1,2}}
        // This is a array that has two array that stores two integers inside each array.
        // Now entering values:
        arr[0][0]= 0;
        arr[0][1]= 1;
        arr[1][0]= 0;
        arr[1][1]= 1;
        // Printing it:
        for (int i = 0; i < arr.length; i++){

            for (int j = 0; j < arr[i].length; j++){

                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
        }
        System.out.println();
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };// This is how you can create a 2d array easily.

        for (int i = 0; i < myNumbers.length; i++){

            for (int j = 0; j < myNumbers[i].length; j++){

                System.out.print(myNumbers[i][j]+" ");
                
            }
            System.out.println();
        }
        
    }
}
