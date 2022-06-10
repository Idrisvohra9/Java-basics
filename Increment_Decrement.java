public class Increment_Decrement {
    public static void main(String[] args){
        int n=10;
        System.out.println("The number is "+ n);
        System.out.println("Pre increment: "+ n++);
        System.out.println("Post increment: "+ ++n);
        System.out.println(n-- - --n + n++ + ++n);
    }
}