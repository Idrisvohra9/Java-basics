public class Math_methods {
    public static void main(String[] args) {
        // math.round() rounds off the float number
        float i=4.567f;
        System.out.println(Math.round(i));

        // abs function converts negative integers to positive integers.
        int j=-7;
        System.out.println(Math.abs(j));

        // sqrt finds square root of a number
        int k=81;
        System.out.println(Math.sqrt(k));

        // min function gives the minimum value from the two parameters
        int l=10,m=9;
        System.out.println(Math.min(l,m));
        // max function gives the maximum value from the two parameters
        System.out.println(Math.max(l,m));

        // random function returns a random float value between 0.0(inclusive) and 1.0 (exclusive).
        System.out.println("Random number from 0.0 to 0.9: "+Math.random());
        // to get a bigger range of random numbers we can do something like this:
        
        int n= (int)(Math.random()*101);// the range is from 0 to 100
        System.out.println(String.format("Random number from 0 to 100: %d",n));
        // There are many other methods for Math built-in class we can see them by typing Math. staring.
    }
}
