public class Strings {
    public static void main(String[] args){
        // A String variable contains a collection of characters surrounded by double quotes:
        // 1. creatin a string variable
        String greetings = "Hello";
        String name = "jacky";
        String str ="This is a string";

        // 2. string length
        System.out.println("The length of the string is "+ greetings.length());

        // 3. uppercase, lowercase
        System.out.println(".toUpperCase() = "+name.toUpperCase());
        System.out.println(".toLowerCase() = "+name.toLowerCase());

        // 4. finding the index of a character or a string
        System.out.println(".indexOf() = "+str.indexOf("is"));

        // 5. concatenate strings:
        // 1:-
        System.out.println(greetings+" "+name);
        // 2:-
        System.out.println(greetings.concat(" ").concat(name));
        // System.out.println(str.compareTo(greetings));
    }
}
