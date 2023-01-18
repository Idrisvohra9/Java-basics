public class TypeCasting {
    public static void main(String[] args){
        float fn= 20.5f;
        int n = (int)fn;
        String st= "72";
        Integer s = Integer.valueOf(st);// converting string to int requires 
        int s1 = Integer.parseInt(st);
        // System.out.print("fn = ");
        // System.out.println(fn);
        // System.out.print("n = ");
        System.out.println(String.format("fn= %f n= %d",fn,n));
        System.out.println(n);
        System.out.println(s);
        System.out.println(s1);

    }
// Widening Casting (automatically) - converting a smaller type to a larger type size
// byte -> short -> char -> int -> long -> float -> double

// Narrowing Casting (manually) - converting a larger type to a smaller size type
// double -> float -> long -> int -> char -> short -> byte
}
