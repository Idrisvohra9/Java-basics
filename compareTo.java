public class compareTo {
    public static void main(String[] args) 
    {
        Integer a=19;
        Integer b=29;
        Integer c=19;
        System.out.println(a.compareTo(b));// Output: -1 when the first number is smaller than the second 
        System.out.println(a.compareTo(c));// Output: 0 when the first number is equal to second
        System.out.println(b.compareTo(a));// Output: 1 when the first number is larger than the second
    }
}
