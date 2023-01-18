public class ExceptionHandling {
    public static void main(String[] args) {
        int[] arr= new int[10];
        int i=0;
        // try-catch block is used to make the code errorless and continuously working
        // try block has the code that throws an error and than catch block catches the error.
        // In this following code there is an exception thrown because there is an error that says the array is out of bounds.
        try {
            arr[11]=23;
        } catch (Exception e) {
            System.out.println("Some error has occurred: " + e.toString());
        }
///////////////////
        // This catches ArithmeticException:
        try {
            int n=10/0;
        } catch (ArithmeticException e) {
            System.out.println("There is an arithmatic error.");
        }
///////////////////////
        // If there is no exception we can create an exception and catch it like so:
        try {
            while(i<=10){
                i++;
                System.out.println(i);
                if(i==10)throw new ArithmeticException();
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString());
        }
/////////////////////////////////////
        // try-catch block with multiple catch blocks:
        try {
            int[] arr2={1,2,3,4};
            int n2=0;
            for(int elements:arr2){
                System.out.println(elements/n2);
            }
            System.out.println(arr2[5]);
            
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred...");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred...");
        }
        finally{
            System.out.println("Total two exceptions.");
        }
        // This is a final block it gets executed after the catch blocks and it cannot be used without the try block.
        // If catch blocks are present then they will be executed before the final block if it is written before them then an error will occur.
        // final block can even be written after the return statement.
    }
}
